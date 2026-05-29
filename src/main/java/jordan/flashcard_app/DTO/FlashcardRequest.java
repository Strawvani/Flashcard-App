package jordan.flashcard_app.DTO;

import lombok.Data;

@Data
public class FlashcardRequest {

    // Fields
    private String definition;
    private String term;
    private Long deckId;
}
