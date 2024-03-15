package app.webbackend.dto.partida;

import app.webbackend.models.Partida;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PartidaMapper {

    PartidaMapper INSTANCE = Mappers.getMapper(PartidaMapper.class);

    PartidaDto partidaEntitytoPartidaDto(Partida partida);

    Partida partidaDtotoPartidaEntity(PartidaDto partidaDto);
}
