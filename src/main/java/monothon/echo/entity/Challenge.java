package monothon.echo.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    private String description;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String tag;

    @Column(nullable = false)
    private Long participants;

    @Builder
    public Challenge(String title, String description, String image, String tag, Long participants) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.tag = tag;
        this.participants = participants;
    }

    public void setParticipants(Long participants) {
        this.participants = participants;
    }
}
