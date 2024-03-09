package app.webbackend.repository;

import app.webbackend.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    List<Usuario> findByNombreAndApellido(String julian, String pizarro);
}
