package monothon.echo.repository;

import monothon.echo.entity.Participate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipateRepository extends JpaRepository<Participate, Long> {
    Participate save(Participate participate);
    void delete(Participate participate);
}
