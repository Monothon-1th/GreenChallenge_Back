package monothon.echo.dto.list.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
;import java.util.List;

@Getter
@NoArgsConstructor
public class AllListResDto {
    private List<OneListResDto> result;

    @Builder
    public AllListResDto(List<OneListResDto> result) {
        this.result = result;
    }
}
