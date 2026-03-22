package com.subastas.sistema_subastas.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Subasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
