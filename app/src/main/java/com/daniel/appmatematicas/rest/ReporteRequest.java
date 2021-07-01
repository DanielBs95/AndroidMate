package com.daniel.appmatematicas.rest;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class ReporteRequest implements Serializable {


    @SerializedName("nombre")
    private String nombre;

    @SerializedName("nota")
    private String nota;

    public ReporteRequest() {
    }

    public ReporteRequest(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
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
