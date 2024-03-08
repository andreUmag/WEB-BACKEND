package app.webbackend.models;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Suegerencias")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class Sugerencia {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private LocalDateTime create_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Usuario usuario;
}
