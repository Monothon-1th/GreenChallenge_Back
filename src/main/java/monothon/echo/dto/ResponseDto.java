package monothon.echo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseDto {
    private int status;
    private Object data;

    @Builder
    public ResponseDto(int status, Object data) {
        this.status = status;
        this.data = data;
    }
}
