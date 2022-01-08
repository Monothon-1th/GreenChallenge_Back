package monothon.bear.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.bear.dto.AuthDto;
import monothon.bear.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody AuthDto authDto) {
        authService.signup(authDto.getLoginId(), authDto.getPassword());
        return ResponseEntity.status(200).body("성공");
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthDto authDto) {
        String res = authService.login(authDto.getLoginId(), authDto.getPassword());
        return ResponseEntity.status(200).body(res);
    }
}
