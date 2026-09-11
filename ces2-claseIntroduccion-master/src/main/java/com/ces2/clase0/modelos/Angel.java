package com.ces2.clase0.modelos;

public class Angel {
    private String nombre;
    private String misionAsignada;

    public Angel(String nombre, String misionAsignada) {
        this.nombre = nombre;
        this.misionAsignada = misionAsignada;
    }

    public String getNombre() { return nombre; }
    public String getMisionAsignada() { return misionAsignada; }
}