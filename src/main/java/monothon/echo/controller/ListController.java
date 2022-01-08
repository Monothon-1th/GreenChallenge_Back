package monothon.echo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.dto.ResponseDto;
import monothon.echo.dto.list.response.AllListResDto;
import monothon.echo.service.ListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/list")
@RequiredArgsConstructor
@Slf4j
public class ListController {
    private final ListService listService;

    @PostMapping("/create")
    public ResponseEntity createList(
            @RequestParam("category") String category,
            @RequestParam("writerId") Long writerId,
            @RequestParam("title") String title,
            @RequestParam("text") String text,
            @RequestParam("image") MultipartFile image
            ) throws IOException {
        listService.createList(category, writerId, title, text, image);
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(null)
                        .build()
        );
    }

    @GetMapping("/all")
    public ResponseEntity getAllList() {
        AllListResDto allListResDto = listService.getAllList();
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(allListResDto)
                        .build()
        );
    }
}
