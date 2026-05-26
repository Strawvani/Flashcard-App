package jordan.flashcard_app.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    // constructor
    public Category() {
    }

    // Relationships
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // getters and setters

}
