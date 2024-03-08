package app.webbackend.models;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Partidas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Partida {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String creador;
    private String deporte;
    private String ciudad;
    private String provincia;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    @Temporal(TemporalType.TIME)
    private LocalDateTime hora_comienzo;
    @Temporal(TemporalType.TIME)
    private LocalDateTime hora_final;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;

    @ManyToMany(mappedBy = "partidas")
    private List<Usuario> usuarios;
}
