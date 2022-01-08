package monothon.echo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.dto.auth.request.LoginReqDto;
import monothon.echo.dto.auth.request.NameReqDto;
import monothon.echo.dto.auth.request.SignupReqDto;
import monothon.echo.dto.auth.response.LoginResDto;
import monothon.echo.dto.ResponseDto;
import monothon.echo.dto.auth.response.NameResDto;
import monothon.echo.dto.auth.response.SignupResDto;
import monothon.echo.service.AuthService;
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
    public ResponseEntity signup(@RequestBody SignupReqDto signupReqDto) {
        SignupResDto signupResDto = authService.signup(signupReqDto.getLoginId(), signupReqDto.getPassword(), signupReqDto.getName());
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(signupResDto)
                        .build()
        );
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginReqDto loginReqDto) {
        LoginResDto loginResDto = authService.login(loginReqDto.getLoginId(), loginReqDto.getPassword());
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(loginResDto)
                        .build()
        );
    }

    @PostMapping("/name")
    public ResponseEntity name(@RequestBody NameReqDto nameReqDto) {
        NameResDto nameResDto = authService.name(nameReqDto.getUserId());
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(nameResDto)
                        .build()
        );
    }
}
