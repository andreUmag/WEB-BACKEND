package app.webbackend.dto.mensaje;

import app.webbackend.models.Mensaje;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MensajeMapper {

    MensajeMapper INSTANCE = Mappers.getMapper(MensajeMapper.class);

    MensajeDto mensajeEntitytoMensajeDto(Mensaje mensaje);

    Mensaje mensajeDtotoMensajeEntity(MensajeDto mensajeDto);
}
