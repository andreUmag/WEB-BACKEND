package app.webbackend.dto.usuario;

import app.webbackend.models.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDto usuarioEntitytoUsuarioDto(Usuario usuario);

    Usuario usuarioDtotoUsuarioEntity(UsuarioToSaveDto usuarioDto);
}
