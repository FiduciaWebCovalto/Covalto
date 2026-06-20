package com.fiduciawebmovil.ayuda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Tema_Ayuda")
public class TemaAyuda {
    @Id
    private Long id;
    private String tema;
    private String descripcion;
    private String url; // Enlace opcional a la documentación
}