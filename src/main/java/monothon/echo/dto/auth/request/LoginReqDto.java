package monothon.echo.dto.auth.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoginReqDto {
    private String loginId;
    private String password;

    @Builder
    public LoginReqDto(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }
}
