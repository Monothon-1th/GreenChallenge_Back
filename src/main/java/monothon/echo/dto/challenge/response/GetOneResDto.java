package monothon.echo.dto.challenge.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GetOneResDto {
    private String title;
    private String description;
    private Long participants;

    @Builder
    public GetOneResDto(String title, String description, Long participants) {
        this.title = title;
        this.description = description;
        this.participants = participants;
    }
}
