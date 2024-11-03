package parcial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import parcial2.model.Capitulos;
import parcial2.service.CapitulosService;

import java.util.List;

@RestController
@RequestMapping("/api/capitulos")
public class CapitulosController {

    @Autowired
    private CapitulosService capituloService;

    @GetMapping("getAll")
    public List<Capitulos> getAllCapitulos() {
        return capituloService.getAllCapitulos();
    }

    @GetMapping("get/{id}")
    public Capitulos getCapituloById(@PathVariable Long id) {
        return capituloService.getCapituloById(id);
    }

    @PostMapping("create")
    public Capitulos createCapitulo(@RequestBody Capitulos capitulo) {
        return capituloService.saveCapitulo(capitulo);
    }

    @DeleteMapping("/{id}")
    public void deleteCapitulo(@PathVariable Long id) {
        capituloService.deleteCapitulo(id);
    }
}