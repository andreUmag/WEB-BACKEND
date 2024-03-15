package app.webbackend.dto.sugerencia;

import app.webbackend.models.Sugerencia;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SugerenciaMapper {

    SugerenciaMapper INSTANCE = Mappers.getMapper(SugerenciaMapper.class);

    SugerenciaDto sugerenciaEntitytoSugerenciaDto(Sugerencia sugerencia);

    Sugerencia sugerenciaDtotoSugerenciaEntity(SugerenciaDto sugerenciaDto);
}
