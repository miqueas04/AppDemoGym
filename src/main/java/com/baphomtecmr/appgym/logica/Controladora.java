package com.baphomtecmr.appgym.logica;

import com.baphomtecmr.appgym.persistencia.ControladoraPersitencia;
import java.time.LocalDate;
import java.util.List;


public class Controladora {
     
    ControladoraPersitencia ControlPersis = new ControladoraPersitencia();

    
    // creamos un nuevo usuario y seteamos sus variables que  viene desde la igu alta usuarios
    public void agregarUsuario(LocalDate fechaIngreso, String nombre, int diasDispo, int edad, String peso, String altura, int dni, String cel, String direc, String observaciones,LocalDate fechaLimite) {
        
        Alumno persona = new Alumno();
        persona.setFechaIngreso(fechaIngreso);
        persona.setNombre(nombre);
        persona.setDiasDispo(diasDispo);
        persona.setEdad(edad);
        persona.setPeso(peso);
        persona.setAltura(altura);
        persona.setDni(dni);
        persona.setCel(cel);
        persona.setDirec(direc);
        persona.setObservaciones(observaciones);
        persona.setFechaLimite(fechaLimite);
        
        ControlPersis.AgregarPersona(persona);
        
    }

    public List<Alumno> traerAlumnos() {
        
       return ControlPersis.traerAlumnos();
        
        
    }

    public void borraAlumno(int idAlumno) {
        ControlPersis.borrarAlumno(idAlumno);
    }

    public Alumno traeAlumno(int idAlumno) {
        return ControlPersis.traerAlumno(idAlumno);
    }

    public void editarAlumno(Alumno alumno, LocalDate fechaIngreso, String nombre, int diasDispo, int edad, String peso, String altura, int dni, String cel, String direc, String observaciones, LocalDate fechaLimite) {
        
       alumno.setNombre(nombre);
       alumno.setFechaIngreso(fechaIngreso);
       alumno.setDiasDispo(diasDispo);
       alumno.setEdad(edad);
       alumno.setAltura(altura);
       alumno.setDirec(direc);
       alumno.setDni(dni);
       alumno.setFechaLimite(fechaLimite);
       alumno.setObservaciones(observaciones);
       alumno.setCel(cel);
       alumno.setPeso(peso);
       
       
        ControlPersis.modificarAlumno(alumno);
        
    }

    
    
}
