package jordan.flashcard_app.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "deck")
public class Deck {

    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "color_code")
    private String color_code;

    // constructor
    public Deck() {
    }

    // getters and setters

}
