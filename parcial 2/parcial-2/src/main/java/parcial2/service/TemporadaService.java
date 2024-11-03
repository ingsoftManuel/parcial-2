package parcial2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcial2.model.Temporadas;
import parcial2.repository.TemporadaRepository;

import java.util.List;

@Service
public class TemporadaService {

    @Autowired
    private TemporadaRepository temporadaRepository;

    public List<Temporadas> getAllTemporadas() {
        return temporadaRepository.findAll();
    }

    public Temporadas getTemporadaById(Long id) {
        return (Temporadas) temporadaRepository.findById(id).orElse(null);
    }

    public Temporadas saveTemporada(Temporadas temporada) {
        return temporadaRepository.save(temporada);
    }

    public void deleteTemporada(Long id) {
        temporadaRepository.deleteById(id);
    }
}