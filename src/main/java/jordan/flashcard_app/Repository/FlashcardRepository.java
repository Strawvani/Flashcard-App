package jordan.flashcard_app.Repository;

import jordan.flashcard_app.Model.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {
}
