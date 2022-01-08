package monothon.echo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.dto.ResponseDto;
import monothon.echo.dto.participate.request.ParticipateReqDto;
import monothon.echo.service.ParticipateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/participate")
@RequiredArgsConstructor
@Slf4j
public class ParticipateController {
    private final ParticipateService participateService;

    @PostMapping("/create")
    public ResponseEntity createParticipate(@RequestBody ParticipateReqDto participateReqDto) {
        participateService.createParticipate(participateReqDto.getUserId(), participateReqDto.getChallengeId());
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(null)
                        .build()
        );
    }

    @PostMapping("/delete")
    public ResponseEntity deleteParticipate(@RequestBody ParticipateReqDto participateReqDto) {
        participateService.deleteParticipate(participateReqDto.getUserId(), participateReqDto.getChallengeId());
        return ResponseEntity.status(200).body(
                ResponseDto.builder()
                        .status(200)
                        .data(null)
                        .build()
        );
    }
}
