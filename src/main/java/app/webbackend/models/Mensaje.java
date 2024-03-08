package app.webbackend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "mensajes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

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
    private usuarios usuario;
}
