package parcial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import parcial2.model.Serie;
import parcial2.service.SerieService;

import java.util.List;

@RestController
@RequestMapping("/api/series")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping
    public List<Serie> getAllSeries() {
        return SerieService.getAllSeries();
    }

    @GetMapping("/{id}")
    public Serie getSerieById(@PathVariable Long id) {
        return SerieService.getSerieById(id);
    }

    @PostMapping
    public Serie createSerie(@RequestBody Serie serie) {
        return serieService.saveSerie(serie);
    }

    @DeleteMapping("/{id}")
    public void deleteSerie(@PathVariable Long id) {
        serieService.deleteSerie(id);
    }
}