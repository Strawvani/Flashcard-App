package jordan.flashcard_app.Repository;

import jordan.flashcard_app.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
