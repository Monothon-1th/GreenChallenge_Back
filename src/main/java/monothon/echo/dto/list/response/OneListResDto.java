package monothon.echo.dto.list.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import monothon.echo.entity.List;

@Getter
@NoArgsConstructor
public class OneListResDto {
    private List list;
    private String writerName;
    private String writerImage;

    @Builder
    public OneListResDto(List list, String writerName, String writerImage) {
        this.list = list;
        this.writerName = writerName;
        this.writerImage = writerImage;
    }
}
