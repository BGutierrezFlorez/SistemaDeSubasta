package com.subastas.sistema_subastas.model;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Subasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "Producto_id", nullable = false, unique = true)
    private Producto producto;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    private String estado = "activa";

    @OneToMany(mappedBy = "subasta")
    private List<Puja> pujas;

    @OneToOne(mappedBy = "subasta")
    private Ganador ganador;

    // getters y setter

}
