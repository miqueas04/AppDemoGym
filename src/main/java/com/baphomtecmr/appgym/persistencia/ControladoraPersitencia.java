package com.baphomtecmr.appgym.persistencia;

import com.baphomtecmr.appgym.logica.Alumno;
import com.baphomtecmr.appgym.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersitencia {
    AlumnoJpaController controlAlum = new AlumnoJpaController();

    public void AgregarPersona(Alumno persona) {
        
        controlAlum.create(persona);
        
        
    }

    public List<Alumno> traerAlumnos() {
        
        return controlAlum.findAlumnoEntities();
    }

    public void borrarAlumno(int idAlumno) {
        try {
            controlAlum.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersitencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int idAlumno) {
        return controlAlum.findAlumno(idAlumno);
    }

    public void modificarAlumno(Alumno alumno) {
        try {
            controlAlum.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersitencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
