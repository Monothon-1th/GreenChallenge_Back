package monothon.echo.dto.auth.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NameReqDto {
    private Long userId;

    @Builder
    public NameReqDto(Long userId) {
        this.userId = userId;
    }
}