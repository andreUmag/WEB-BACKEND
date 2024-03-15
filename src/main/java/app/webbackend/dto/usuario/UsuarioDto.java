package app.webbackend.dto.usuario;

import app.webbackend.dto.mensaje.MensajeDto;
import app.webbackend.dto.sugerencia.SugerenciaDto;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public record UsuarioDto(
        Long id,
        String nombre,
        String apellido,
        String username,
        String email,
        Integer edad,
        String password,
        String rep_password,
        Boolean enabled,
        String foto,
        String rol,
        LocalDateTime create_at,

        List<SugerenciaDto> sugerencias,
        List<MensajeDto> mensajes
) {
    public List<SugerenciaDto> sugerencias(){
        return Collections.unmodifiableList(sugerencias);
    }
    public List<MensajeDto> mensajes(){
        return Collections.unmodifiableList(mensajes);
    }
}
