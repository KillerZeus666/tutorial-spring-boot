package com.ingesof.ejemploClase.web.web;

import org.springframework.web.bind.annotation.RestController;

import com.ingesof.ejemploClase.web.accesoDatos.TareaRepository;

@RestController
public class TareasController {
    TareaRepository tareas; 

    public TareasController(TareaRepository tareas){ 
        this.tareas= tareas; 
    }
}
