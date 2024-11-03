package parcial2.model;

import jakarta.persistence.*;



@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String foto;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;

    // Getters y Setters
}