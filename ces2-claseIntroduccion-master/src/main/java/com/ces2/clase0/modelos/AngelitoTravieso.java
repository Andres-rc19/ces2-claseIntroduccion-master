package com.ces2.clase0.modelos;

public class AngelitoTravieso implements SerAngelical {
    private Angel angel;

    public AngelitoTravieso(Angel angel) {
        this.angel = angel;
    }

    @Override
    public String obtenerNombre(Angel a) {
        return "El travieso juega con: " + this.angel.getNombre();
    }

    @Override
    public String volar(Angel a) {
        return "Vuelo en zig-zag alrededor de " + this.angel.getNombre();
    }

    @Override
    public String realizarMision(Angel a) {
        return "Hace un lío intentando: " + this.angel.getMisionAsignada();
    }
}