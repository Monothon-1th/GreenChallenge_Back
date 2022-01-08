package monothon.echo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.dto.auth.response.LoginResDto;
import monothon.echo.dto.auth.response.NameResDto;
import monothon.echo.dto.auth.response.SignupResDto;
import monothon.echo.entity.User;
import monothon.echo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AuthService {
    private final UserRepository userRepository;

    public SignupResDto signup(String loginId, String password, String name) {
        User user = User.builder()
                .loginId(loginId)
                .password(password)
                .name(name)
                .image("https://monothon.s3.ap-northeast-2.amazonaws.com/%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%91%E1%85%B5%E1%86%AF%E1%84%80%E1%85%B5%E1%84%87%E1%85%A9%E1%86%AB%E1%84%8B%E1%85%B5%E1%84%86%E1%85%B5%E1%84%8C%E1%85%B5.png")
                .build();

        userRepository.save(user);

        return SignupResDto.builder()
                .result("성공")
                .build();
    }

    public LoginResDto login(String loginId, String password) {
        Optional<User> user = userRepository.findByLoginId(loginId);
        user.ifPresent(m -> {
            if (!m.getPassword().equals(password))
                throw new RuntimeException();
        });

        return LoginResDto.builder()
                .userId(user.get().getId())
                .build();
    }

    public NameResDto name(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        return NameResDto.builder()
                .result(user.get().getName())
                .build();
    }
}
