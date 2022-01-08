package monothon.echo.repository;

import monothon.echo.entity.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<List, Long> {
    List save(List list);
}
