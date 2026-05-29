package jordan.flashcard_app.Service;

import jordan.flashcard_app.Repository.FlashcardRepository;
import org.springframework.stereotype.Service;

@Service
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;

    public FlashcardService(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }
}
