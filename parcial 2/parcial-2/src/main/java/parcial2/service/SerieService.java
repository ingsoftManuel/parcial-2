package parcial2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcial2.model.Serie;
import parcial2.repository.SerieRepository;

import java.util.List;

@Service
public class SerieService {

    @Autowired
    private static SerieRepository serieRepository;

    public static List<Serie> getAllSeries() {
        return serieRepository.findAll();
    }

    public static Serie getSerieById(Long id) {
        return (Serie) serieRepository.findById(id).orElse(null);
    }

    public Serie saveSerie(Serie serie) {
        return serieRepository.save(serie);
    }

    public void deleteSerie(Long id) {
        serieRepository.deleteById(id);
    }
}