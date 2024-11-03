package parcial2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Temporadas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private int anio;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;

    @OneToMany(mappedBy = "temporada", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Capitulos> capitulos;

    // Getters y Setters
}