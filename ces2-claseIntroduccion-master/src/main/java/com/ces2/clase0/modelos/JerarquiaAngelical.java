package com.ces2.clase0.modelos;

import java.util.ArrayDeque;
import java.util.Deque;

public class JerarquiaAngelical {
    private String nombreJerarquia;
    private EnumAngel tipoAngel;
    private Categoria categoria;
    private Deque<Angel> angeles;

    public JerarquiaAngelical() {
        this.angeles = new ArrayDeque<>();
    }

    public JerarquiaAngelical(String nombreJerarquia, EnumAngel tipoAngel, Categoria categoria) {
        this.nombreJerarquia = nombreJerarquia;
        this.tipoAngel = tipoAngel;
        this.categoria = categoria;
        this.angeles = new ArrayDeque<>();
    }

    public void agregarAngel(Angel angel) {
        this.angeles.add(angel);
    }

    public void setNombreJerarquia(String nombreJerarquia) { this.nombreJerarquia = nombreJerarquia; }
    public String getNombreJerarquia() { return nombreJerarquia; }
    public void setTipoAngel(EnumAngel tipoAngel) { this.tipoAngel = tipoAngel; }
    public EnumAngel getTipoAngel() { return tipoAngel; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public Categoria getCategoria() { return categoria; }
    public Deque<Angel> getAngeles() { return angeles; }
}