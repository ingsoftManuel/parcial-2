package parcial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import parcial2.model.Temporadas;
import parcial2.service.TemporadaService;

import java.util.List;

@RestController
@RequestMapping("/api/temporadas")
public class TemporadaController {

    @Autowired
    private TemporadaService temporadaService;

    @GetMapping
    public List<Temporadas> getAllTemporadas() {
        return temporadaService.getAllTemporadas();
    }

    @GetMapping("/{id}")
    public Temporadas getTemporadaById(@PathVariable Long id) {
        return temporadaService.getTemporadaById(id);
    }

    @PostMapping
    public Temporadas createTemporada(@RequestBody Temporadas temporada) {
        return temporadaService.saveTemporada(temporada);
    }

    @DeleteMapping("/{id}")
    public void deleteTemporada(@PathVariable Long id) {
        temporadaService.deleteTemporada(id);
    }
}