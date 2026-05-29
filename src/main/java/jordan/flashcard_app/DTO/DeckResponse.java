package jordan.flashcard_app.DTO;

import jordan.flashcard_app.Model.Deck;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeckResponse {

    // Fields
    private Long id;
    private String name;
    private String description;
    private String colorCode;
    private String categoryName;

    public static DeckResponse fromEntity(Deck deck) {
        return DeckResponse.builder()
                .id(deck.getId())
                .name(deck.getName())
                .description(deck.getDescription())
                .colorCode(deck.getColorCode())
                .categoryName(deck.getCategory().getName())
                .build();
    }
}
