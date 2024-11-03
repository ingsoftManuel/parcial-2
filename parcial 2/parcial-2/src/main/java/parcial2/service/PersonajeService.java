package parcial2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcial2.model.Personaje;
import parcial2.repository.PersonajeRepository;

import java.util.List;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    public Personaje getPersonajeById(Long id) {
        return (Personaje) personajeRepository.findById(id).orElse(null);
    }

    public Personaje savePersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public void deletePersonaje(Long id) {
        personajeRepository.deleteById(id);
    }
}