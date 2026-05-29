package jordan.flashcard_app.DTO;

import jordan.flashcard_app.Model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    // Fields
    private Long id;
    private String username;
    private String email;

    public static UserResponse fromEntity(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
    }
}
