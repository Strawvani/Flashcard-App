package jordan.flashcard_app.DTO;

import lombok.Data;

@Data
public class RegisterRequest {

    // Fields
    private String username;
    private String password;
    private String email;
}
