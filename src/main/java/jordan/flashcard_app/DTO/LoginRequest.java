package jordan.flashcard_app.DTO;

import lombok.Data;

@Data
public class LoginRequest {

    // Fields
    private String password;
    private String email;
}
