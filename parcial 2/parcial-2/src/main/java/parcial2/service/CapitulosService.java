package parcial2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import parcial2.model.Capitulos;
import parcial2.repository.CapitulosRepository;

import java.util.List;

@Service
public class CapitulosService {

    @Autowired
    private CapitulosRepository capituloRepository;

    public List<Capitulos> getAllCapitulos() {
        try {
            return capituloRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error al conseguir los capítulos", e);
        }
    }

    public Capitulos getCapituloById(Long id) {
        try {
            return capituloRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new RuntimeException("Error al conseguir el capitulo", e);
        }
    }

    public Capitulos saveCapitulo(Capitulos capitulo) {
        try {
            return capituloRepository.save(capitulo);
        } catch (Exception e) {
            throw new RuntimeException("Error al guardar el capítulo", e);
        }
    }

    public void deleteCapitulo(Long id) {
        try {
             capituloRepository.deleteById(id);
        }catch (Exception e){
            throw new RuntimeException("Error al eliminar el capítulo", e);
        }
    }
}
