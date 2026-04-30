package com.subastas.sistema_subastas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ganadores")
public class Ganador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "subasta_id", nullable = false, unique = true)
    private Subasta subasta;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "monto_final", nullable = false)
    private Double montoFinal;

    @Column(nullable = false, updatable = false)
    private LocalDateTime fecha;

    @PrePersist
    public void prePersist(){
        this.fecha = LocalDateTime.now();
    }


}
