package com.ces2.clase0.modelos;

import java.util.Stack;
import java.util.function.Function;

public class Angel {
    private String nombre;
    private EnumAngel tipoAngel;
    private Categoria categoria;
    private Stack<Integer> conteo;

    public Angel() {
        this.conteo = new Stack<>();
    }

    public Angel(String nombre, EnumAngel tipoAngel, Categoria categoria) {
        this.nombre = nombre;
        this.tipoAngel = tipoAngel;
        this.categoria = categoria;
        this.conteo = new Stack<>();
    }

    public void agregarConteo(Integer valor) {
        this.conteo.push(valor);
    }

    public Integer verTotales(Function<Angel, Integer> funcion) {
        return funcion.apply(this);
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setTipoAngel(EnumAngel tipoAngel) { this.tipoAngel = tipoAngel; }
    public EnumAngel getTipoAngel() { return tipoAngel; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public Categoria getCategoria() { return categoria; }
    public Stack<Integer> getConteo() { return conteo; }

    @Override
    public String toString() {
        return "Angel: " + nombre + " | Enum: " + tipoAngel + " | Categoria: " + categoria + " | Conteo: " + conteo;
    }
}