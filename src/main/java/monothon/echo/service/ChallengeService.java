package monothon.echo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.dto.challenge.response.GetAllResDto;
import monothon.echo.dto.challenge.response.GetOneResDto;
import monothon.echo.entity.Challenge;
import monothon.echo.repository.ChallengeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ChallengeService {
    private final ChallengeRepository challengeRepository;

    public GetAllResDto getAllChallenge() {
        List<Challenge> list = challengeRepository.findAll();
        return GetAllResDto.builder()
                .result(list)
                .build();
    }

    public GetOneResDto getOneChallenge(Long id) {
        Challenge challenge = challengeRepository.findById(id).get();
        return GetOneResDto.builder()
                .title(challenge.getTitle())
                .description(challenge.getDescription())
                .participants(challenge.getParticipants())
                .build();
    }
}
