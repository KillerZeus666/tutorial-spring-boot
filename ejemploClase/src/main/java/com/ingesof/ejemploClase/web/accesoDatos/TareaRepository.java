package com.ingesof.ejemploClase.web.accesoDatos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingesof.ejemploClase.web.modelo.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {


}
