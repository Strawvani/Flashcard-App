package jordan.flashcard_app.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlashcardResponse {

    // Fields
    private Long id;
    private String definition;
    private String term;
    private String status;
    private String deckName;
}
