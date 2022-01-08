package monothon.echo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.dto.ResponseDto;
import monothon.echo.dto.challenge.response.GetAllResDto;
import monothon.echo.dto.challenge.response.GetOneResDto;
import monothon.echo.service.ChallengeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/challenge")
@RequiredArgsConstructor
@Slf4j
public class ChallengeController {
    private final ChallengeService challengeService;

    @GetMapping("/all")
    public ResponseEntity getAllChallenge() {
        GetAllResDto getAllResDto = challengeService.getAllChallenge();
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(getAllResDto)
                        .build()
        );
    }

    @GetMapping("/args")
    public ResponseEntity getOneChallenge(@RequestParam(value = "id") Long id) {
        System.out.println(id);
        GetOneResDto getOneResDto = challengeService.getOneChallenge(id);
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(getOneResDto)
                        .build()
        );
    }
}
