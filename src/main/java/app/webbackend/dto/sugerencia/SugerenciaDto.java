package app.webbackend.dto.sugerencia;

import java.time.LocalDateTime;

public record SugerenciaDto(
        Long id,
        String descripcion,
        LocalDateTime create_at)
{

}
