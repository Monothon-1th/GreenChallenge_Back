package monothon.echo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import monothon.echo.entity.Challenge;
import monothon.echo.entity.Participate;
import monothon.echo.repository.ChallengeRepository;
import monothon.echo.repository.ParticipateRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ParticipateService {
    private final ParticipateRepository participateRepository;
    private final ChallengeRepository challengeRepository;

    public void createParticipate(Long userId, Long challengeId) {
        Participate participate = Participate.builder()
                .userId(userId)
                .challengeId(challengeId)
                .build();

        participateRepository.save(participate);

        Challenge challenge = challengeRepository.findById(challengeId).get();
        challenge.setParticipants(challenge.getParticipants() + 1);
        challengeRepository.save(challenge);
    }

    public void deleteParticipate(Long userId, Long challengeId) {
        Participate participate = Participate.builder()
                .userId(userId)
                .challengeId(challengeId)
                .build();

        participateRepository.delete(participate);

        Challenge challenge = challengeRepository.findById(challengeId).get();
        challenge.setParticipants(challenge.getParticipants() - 1);
        challengeRepository.save(challenge);
    }
}
