package parcial2.model;

import jakarta.persistence.*;

@Entity
public class Capitulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private int codigo;
    private double calificacion;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporadas temporada;

    // Getters y Setters
}