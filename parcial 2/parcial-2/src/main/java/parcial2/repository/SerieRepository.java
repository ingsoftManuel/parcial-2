package parcial2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import parcial2.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}