package parcial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import parcial2.model.Personaje;
import parcial2.model.Serie;
import parcial2.model.Temporadas;
import parcial2.service.SerieService2;

import java.util.List;

@Controller
public class SerieController3 {

    @Autowired
    private SerieService2 serieService;

    @GetMapping("/")
    public String mostrarSerie(Model model) {
        Serie serie = serieService.obtenerSerie(1L);
        model.addAttribute("serie", serie);
        return "index"; // Plantilla principal
    }

    @GetMapping("/personajes")
    public String mostrarPersonajes(Model model) {
        List<Personaje> personajes = serieService.obtenerPersonajes();
        model.addAttribute("personajes", personajes);
        return "personajes"; // Plantilla personajes.html
    }

    @GetMapping("/episodios")
    public String mostrarEpisodios(Model model) {
        List<Temporadas> temporadas = serieService.obtenerTemporadasPorSerie(1L);
        model.addAttribute("temporadas", temporadas);
        return "episodios"; // Plantilla episodios.html
    }
}