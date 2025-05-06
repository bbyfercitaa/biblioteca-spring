package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Paciente;
import java.util.List;
import java.util.Date;



@Repository
public interface pacienteRepository extends JpaRepository<Paciente, Long> {
    
    List<Paciente> findByApellidos(String apellidos);
    Paciente findByCorreo(String correo);
    List<Paciente> findByNombreAndApellidos(String nombre, String apellidos);

}
