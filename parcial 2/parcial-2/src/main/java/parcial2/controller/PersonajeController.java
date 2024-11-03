package parcial2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import parcial2.model.Personaje;
import parcial2.service.PersonajeService;

import java.util.List;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeService.getAllPersonajes();
    }

    @GetMapping("/{id}")
    public Personaje getPersonajeById(@PathVariable Long id) {
        return personajeService.getPersonajeById(id);
    }

    @PostMapping
    public Personaje createPersonaje(@RequestBody Personaje personaje) {
        return personajeService.savePersonaje(personaje);
    }

    @DeleteMapping("/{id}")
    public void deletePersonaje(@PathVariable Long id) {
        personajeService.deletePersonaje(id);
    }
}