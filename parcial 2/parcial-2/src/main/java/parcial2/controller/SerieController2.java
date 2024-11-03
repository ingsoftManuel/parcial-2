package parcial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import parcial2.model.Serie;
import parcial2.service.SerieService2;

@Controller
public class SerieController2 {

    @Autowired
    private SerieService2 serieService;

    @GetMapping("/")
    public String mostrarSerie(Model model) {
        Serie serie = serieService.obtenerSerie(1L); // Asumiendo que el ID 1 corresponde a "Los Simpson"
        model.addAttribute("serie", serie);
        model.addAttribute("personajes", serieService.obtenerPersonajes());
        model.addAttribute("temporadas", serieService.obtenerTemporadasPorSerie(1L));

        return "index"; // Nombre de la plantilla Thymeleaf (index.html)
    }
}