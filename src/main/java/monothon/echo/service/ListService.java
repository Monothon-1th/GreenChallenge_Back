package monothon.echo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.dto.list.response.AllListResDto;
import monothon.echo.dto.list.response.OneListResDto;
import monothon.echo.entity.List;
import monothon.echo.entity.User;
import monothon.echo.repository.ListRepository;
import monothon.echo.repository.UserRepository;
import monothon.echo.util.S3Util;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ListService {
    private final ListRepository listRepository;
    private final UserRepository userRepository;
    private final S3Util s3Util;

    public void createList(String category, Long writerId, String title, String text, MultipartFile image) throws IOException {
        List list = List.builder()
                .category(category)
                .writerId(writerId)
                .title(title)
                .text(text)
                .image(s3Util.getImageSource(s3Util.upload(image, "lists")))
                .createdAt(LocalDateTime.now())
                .heart(0L)
                .comment(0L)
                .build();

        listRepository.save(list);
    }

    public AllListResDto getAllList() {
        java.util.List<List> list = listRepository.findAll();
        java.util.List<OneListResDto> result = new ArrayList<>();
        for(List l: list) {
            User user = userRepository.findById(l.getWriterId()).get();
            OneListResDto oneListResDto = OneListResDto.builder()
                    .list(l)
                    .writerName(user.getName())
                    .writerImage(user.getImage())
                    .build();
            result.add(oneListResDto);
        }
        AllListResDto allListResDto = AllListResDto.builder()
                .result(result)
                .build();
        return allListResDto;
    }
}
