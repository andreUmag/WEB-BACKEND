package app.webbackend.models;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Mensajes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Mensaje {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String creador;
    private String destinatario;
    private String contenido;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime create_at;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id", nullable = false)
    private Usuario usuario;
}
