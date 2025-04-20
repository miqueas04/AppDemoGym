package com.baphomtecmr.appgym.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno implements Serializable {
    // Varss
    @Id// asignamos mediante la anotation que id = id lo que lo convierte en una entidad
    @GeneratedValue(strategy=GenerationType.AUTO)// asignamoss que se auto genere el valor en la base de datos
    private int id;
    private LocalDate fechaIngreso;
    private String nombre;
    private int diasDispo;
    private int edad;
    private String peso;
    private String altura;
    private int dni;
    private String cel;
    private String direc;
    private String observaciones;
    private LocalDate fechaLimite;

    public Alumno() {
    }

    public Alumno(int id, LocalDate fechaIngreso, String nombre, int diasDispo, int edad, String peso, String altura, int dni, String cel, String direc, String observaciones, LocalDate fechaLimite) {
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.diasDispo = diasDispo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
        this.cel = cel;
        this.direc = direc;
        this.observaciones = observaciones;
        this.fechaLimite = fechaLimite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiasDispo() {
        return diasDispo;
    }

    public void setDiasDispo(int diasDispo) {
        this.diasDispo = diasDispo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    
    
    
}
