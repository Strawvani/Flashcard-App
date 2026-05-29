package jordan.flashcard_app.DTO;

import lombok.Data;

@Data
public class DeckRequest {

    // Fields
    private String name;
    private String description;
    private String colorCode;
    private Long categoryId;
}
