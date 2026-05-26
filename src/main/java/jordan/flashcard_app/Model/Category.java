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

    // getters and setters

}
