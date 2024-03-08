package app.webbackend.models;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true)
    private String email;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String password;
    private String rep_password;
    private Boolean enabled;
    private String foto;
    private String Rol;
    private LocalDateTime create_at;

    @OneToMany(mappedBy = "usuarios")
    private List<Sugerencia> sugerencias;

    @OneToMany(mappedBy = "usuarios")
    private List<Mensaje> mensajes;

    @ManyToMany
    @JoinTable(name="usuarios_partidas", joinColumns= @JoinColumn( name="idUsuario", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn( name="idPartida", referencedColumnName="id"))
    private List<Partida> partidas;
}