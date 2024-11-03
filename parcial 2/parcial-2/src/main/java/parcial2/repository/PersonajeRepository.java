package parcial2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import parcial2.model.Personaje;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}