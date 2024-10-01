package com.ingesof.ejemploClase.web.modelo;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@Entity
public class Tarea {

    @Id 
    private Integer Id; 
    private String nombre;
    private Boolean terminado; 
    private String descripcion; 
    //Con atributos de tipo clase puedo tener nulos 
}
