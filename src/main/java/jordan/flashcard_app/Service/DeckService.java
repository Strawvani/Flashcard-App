package jordan.flashcard_app.Service;

import jordan.flashcard_app.Repository.DeckRepository;
import org.springframework.stereotype.Service;

@Service
public class DeckService {

    private final DeckRepository deckRepository;

    public DeckService(DeckRepository deckRepository) {
        this.deckRepository = deckRepository;
    }
}
