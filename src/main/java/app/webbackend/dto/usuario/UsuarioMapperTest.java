package app.webbackend.dto.usuario;

import app.webbackend.dto.usuario.UsuarioDto;
import app.webbackend.models.Mensaje;
import app.webbackend.models.Sugerencia;
import app.webbackend.models.Usuario;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class UsuarioMapperTest {

    Sugerencia sugerencia = Sugerencia.builder().descripcion("Prueba").build();

    List<Sugerencia> sugerencias = List.of(sugerencia);

    Mensaje mensaje = Mensaje.builder().contenido("Jelouda").build();

    List<Mensaje> mensajes = List.of(mensaje);

    Usuario usuario = Usuario.builder()
            .nombre("Lenis")
            .apellido("Estevez")
            .username("Lenis_S21")
            .email("ljestevez@stvz.com")
            .sugerencias(sugerencias)
            .mensajes(mensajes)
            .build();

    UsuarioDto usuarioDto = UsuarioMapper.INSTANCE.usuarioEntitytoUsuarioDto(usuario);

    @Test
    public void usuarioEntitytoDto() {
        assertThat(usuarioDto.nombre().isEmpty());
        assertThat(usuarioDto.nombre()).isEqualTo("Lenis");
    }

}

