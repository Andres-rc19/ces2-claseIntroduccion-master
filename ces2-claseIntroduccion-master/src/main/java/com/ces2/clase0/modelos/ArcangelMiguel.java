package com.ces2.clase0.modelos;

public class ArcangelMiguel implements SerAngelical {
    private Angel angel;

    // Recibe el objeto en el constructor para poner a funcionar los métodos
    public ArcangelMiguel(Angel angel) { 
        this.angel = angel;
    }

    @Override
    public String obtenerNombre(Angel a) {
        return "Arcángel Miguel protege a: " + this.angel.getNombre();
    }

    @Override
    public String volar(Angel a) {
        return "Miguel vuela velozmente junto a " + this.angel.getNombre();
    }

    @Override
    public String realizarMision(Angel a) {
        return "Miguel cumple la misión: " + this.angel.getMisionAsignada();
    }
}