package monothon.echo.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class List {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Long writerId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private Long heart;

    @Column(nullable = false)
    private Long comment;

    @Builder
    public List(String category, Long writerId, String title, String text, String image, LocalDateTime createdAt, Long heart, Long comment) {
        this.category = category;
        this.writerId = writerId;
        this.title = title;
        this.text = text;
        this.image = image;
        this.createdAt = createdAt;
        this.heart = heart;
        this.comment = comment;
    }
}
