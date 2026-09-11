package com.ces2.clase0.modelos;

public class SerAfer implements SerAngelical {
    private Angel angel;

    public SerAfer(Angel angel) {
        this.angel = angel;
    }

    @Override
    public String obtenerNombre(Angel a) {
        return "El Ser Afer guía a: " + this.angel.getNombre();
    }

    @Override
    public String volar(Angel a) {
        return "Afer despliega alas sobre " + this.angel.getNombre();
    }

    @Override
    public String realizarMision(Angel a) {
        return "Afer asiste en: " + this.angel.getMisionAsignada();
    }
}
