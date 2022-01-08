package monothon.bear.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.bear.entity.User;
import monothon.bear.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AuthService {
    private final UserRepository userRepository;

    public String signup(String loginId, String password) {
        User user = User.builder()
                .loginId(loginId)
                .password(password)
                .build();

        userRepository.save(user);

        return "성공";
    }

    public String login(String loginId, String password) {
        Optional<User> user = userRepository.findByLoginId(loginId);
        user.ifPresent(m -> {
            if (!m.getPassword().equals(password))
                throw new RuntimeException();
        });

        return user.get().getLoginId();
    }
}
