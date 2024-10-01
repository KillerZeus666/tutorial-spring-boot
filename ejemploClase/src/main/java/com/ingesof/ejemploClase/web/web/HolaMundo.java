package com.ingesof.ejemploClase.web.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class HolaMundo {
    
    @GetMapping("/")
    public String hola(){
        return "Hola Mundo!!";

    }
}
