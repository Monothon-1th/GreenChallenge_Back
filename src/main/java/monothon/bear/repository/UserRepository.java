package monothon.bear.repository;

import monothon.bear.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
    Optional<User> findByLoginId(String loginId);
    void delete(User user);
}
