package jordan.flashcard_app.DTO;

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
}
