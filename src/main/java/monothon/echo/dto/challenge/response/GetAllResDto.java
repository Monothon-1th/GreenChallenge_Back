package monothon.echo.dto.challenge.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import monothon.echo.entity.Challenge;

import java.util.List;

@Getter
@NoArgsConstructor
public class GetAllResDto {
    private List<Challenge> result;

    @Builder
    public GetAllResDto(List<Challenge> result) {
        this.result = result;
    }
}
