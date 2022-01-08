package monothon.echo.dto.auth.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginResDto {
    private Long userId;

    @Builder
    public LoginResDto(Long userId) {
        this.userId = userId;
    }
}
