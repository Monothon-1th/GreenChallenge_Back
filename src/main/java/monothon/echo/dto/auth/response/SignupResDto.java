package monothon.echo.dto.auth.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignupResDto {
    private String result;

    @Builder
    public SignupResDto(String result) {
        this.result = result;
    }
}
