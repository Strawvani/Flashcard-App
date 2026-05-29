package jordan.flashcard_app.DTO;

import jordan.flashcard_app.Model.Flashcard;
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

    public static FlashcardResponse fromEntity(Flashcard flashcard) {
        return FlashcardResponse.builder()
                .id(flashcard.getId())
                .definition(flashcard.getDefinition())
                .term(flashcard.getTerm())
                .status(flashcard.getStatus().getDisplayName())
                .deckName(flashcard.getDeck().getName())
                .build();
    }
}
