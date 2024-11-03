package parcial2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import parcial2.model.Temporadas;

public interface TemporadaRepository extends JpaRepository<Temporadas, Long> {
}