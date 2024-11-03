package parcial2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcial2.model.Personaje;
import parcial2.model.Serie;
import parcial2.model.Temporadas;
import parcial2.repository.PersonajeRepository2;
import parcial2.repository.SerieRepository2;
import parcial2.repository.TemporadaRepository2;

import java.util.List;

@Service
public class SerieService2 {

    @Autowired
    private SerieRepository2 serieRepository2;

    @Autowired
    private TemporadaRepository2 temporadaRepository2;

    @Autowired
    private PersonajeRepository2 personajeRepository2;

    public Serie obtenerSerie(Long id) {
        return serieRepository2.findById(id).orElse(null);
    }

    public List<Temporadas> obtenerTemporadasPorSerie(Long serieId) {
        // Método para obtener las temporadas asociadas a una serie específica
        return temporadaRepository2.findAll();
    }

    public List<Personaje> obtenerPersonajes() {
        // Método para obtener todos los personajes de la serie
        return personajeRepository2.findAll();
    }
}