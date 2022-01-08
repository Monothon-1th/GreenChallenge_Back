package monothon.echo.dto.participate.request;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ParticipateReqDto {
    private Long userId;
    private Long challengeId;

    @Builder
    public ParticipateReqDto(Long userId, Long challengeId) {
        this.userId = userId;
        this.challengeId = challengeId;
    }
}