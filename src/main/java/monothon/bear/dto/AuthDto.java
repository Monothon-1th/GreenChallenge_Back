package monothon.bear.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AuthDto {
    private String loginId;
    private String password;

    @Builder
    public AuthDto(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }
}
