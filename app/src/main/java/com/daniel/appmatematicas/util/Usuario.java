package com.daniel.appmatematicas.util;

import java.util.Date;

public class Usuario {
    private String nombre;
    private String nota;
    private Date fecha;


    public Usuario() {
    }

    public Usuario(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
        this.fecha = new Date();
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
