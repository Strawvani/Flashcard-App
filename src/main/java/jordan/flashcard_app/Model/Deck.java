package jordan.flashcard_app.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "deck")
public class Deck {

    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "color_code")
    private String colorCode;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    // constructor

}
