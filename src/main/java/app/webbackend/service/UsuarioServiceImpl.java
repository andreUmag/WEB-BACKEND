package app.webbackend.service;

import app.webbackend.dto.usuario.UsuarioDto;
import app.webbackend.dto.usuario.UsuarioMapper;
import app.webbackend.dto.usuario.UsuarioToSaveDto;
import app.webbackend.exception.UsuarioNotFoundException;
import app.webbackend.models.Usuario;
import app.webbackend.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDto saveUsuario(UsuarioToSaveDto usuarioDto) {
        Usuario usuario = UsuarioMapper.INSTANCE.usuarioDtotoUsuarioEntity(usuarioDto);
        Usuario usuarioGuardado = usuarioRepository.save(usuario);
        return UsuarioMapper.INSTANCE.usuarioEntitytoUsuarioDto(usuarioGuardado);
    }

    @Override
    public UsuarioDto updateUsuario(UsuarioDto usuarioDto) {
        return null;
    }

    @Override
    public UsuarioDto findUsuarioById(Long id) throws UsuarioNotFoundException {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(UsuarioNotFoundException::new);
        return UsuarioMapper.INSTANCE.usuarioEntitytoUsuarioDto(usuario);
    }

    @Override
    public UsuarioDto findUsuarioByEmail(String email) {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (Objects.isNull(usuario))
            throw new UsuarioNotFoundException("Usuario no encontrado");
        return usuarioMapper.usuarioEntitytoUsuarioDto(usuario);
    }


}
