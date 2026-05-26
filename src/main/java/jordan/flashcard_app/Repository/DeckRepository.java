package jordan.flashcard_app.Repository;

import jordan.flashcard_app.Model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository extends JpaRepository<Deck,Long> {
}
