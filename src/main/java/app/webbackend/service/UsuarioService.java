package app.webbackend.service;

import app.webbackend.dto.usuario.UsuarioDto;
import app.webbackend.dto.usuario.UsuarioToSaveDto;
import app.webbackend.models.Usuario;

public interface UsuarioService {
    UsuarioDto saveUsuario(UsuarioToSaveDto usuarioDto);
    UsuarioDto updateUsuario(UsuarioDto usuarioDto);

    UsuarioDto findUsuarioById(Long id);

    UsuarioDto findUsuarioByEmail(String email);
}
