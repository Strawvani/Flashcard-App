package jordan.flashcard_app.Model;

import jakarta.persistence.*;
import jordan.flashcard_app.Enum.FlashcardStatus;

@Entity
@Table(name = "flashcard")
public class Flashcard {

    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "definition", nullable = false)
    private String definition;

    @Column(name = "term", nullable = false)
    private String term;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private FlashcardStatus status = FlashcardStatus.NEW;

    // Constructor
    public Flashcard() {
    }

    // Getters and Setters

}
