package app.webbackend.repository;
import app.webbackend.models.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SugerenciaRepository extends JpaRepository<Sugerencia, Long> {
}
