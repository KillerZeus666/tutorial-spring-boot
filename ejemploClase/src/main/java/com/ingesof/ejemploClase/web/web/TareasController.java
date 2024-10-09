package com.ingesof.ejemploClase.web.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingesof.ejemploClase.web.accesoDatos.TareaRepository;
import com.ingesof.ejemploClase.web.modelo.Tarea;

@RestController
public class TareasController {
    private TareaRepository tareas=null; 

    public TareasController(TareaRepository tareas){ 
        this.tareas= tareas; 
        
    //muestre todas las tareas
    @GetMapping("/tareas")
    public List<Tarea> mostrarTareas(){
        return tareas.findAll(); 
    
    }
    //Agregar una tarea
    public Tarea agregarTarea(Tarea tarea){
        //recibe objeto Tarea, lo graba en la DB 
        return tareas.save(tarea); 
    }
}
