package monothon.echo.dto.auth.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NameResDto {
    private String result;

    @Builder
    public NameResDto(String result) {
        this.result = result;
    }
}