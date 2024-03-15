package app.webbackend.dto.mensaje;

import java.time.LocalDateTime;

public record MensajeDto(
        Long id,
        String creador,
        String destinatario,
        String contenido,
        LocalDateTime create_at)
{

}
