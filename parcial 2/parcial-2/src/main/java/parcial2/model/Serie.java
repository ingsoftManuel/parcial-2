package parcial2.model;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String creador;
    private double clasificacion;
    private String poster;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Temporadas> temporadas;

    // Getters y Setters
}