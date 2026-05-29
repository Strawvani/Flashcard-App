package jordan.flashcard_app.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    // Fields
    private Long id;
    private String username;
    private String email;
}
