package com.subastas.sistema_subastas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "precio_inicial", nullable = false)
    private Double precioInicial;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "fecha_publicacion")
    private LocalDateTime fechaPublicacion = LocalDateTime.now();

    @OneToOne(mappedBy = "producto")
    private Subasta subasta;

    // getters y setters

}
