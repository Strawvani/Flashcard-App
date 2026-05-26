package jordan.flashcard_app.Repository;

import jordan.flashcard_app.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
