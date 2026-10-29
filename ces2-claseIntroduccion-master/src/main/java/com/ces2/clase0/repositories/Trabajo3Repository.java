package com.ces2.clase0.repositories;

import com.ces2.clase0.modelos.*;
import org.springframework.stereotype.Repository;
import java.util.Stack;

@Repository
public class Trabajo3Repository {
    private Stack<Angel> stackAngeles = new Stack<>();
    private JerarquiaAngelical jerarquia;

    public Trabajo3Repository() {
        // PUNTO 1: Crear 5 objetos con el mismo EnumAngel y Categoria
        Angel a1 = new Angel("Miguel", EnumAngel.ARCANGEL, Categoria.PRIMERA_ESFERA);
        a1.agregarConteo(10); a1.agregarConteo(20);

        Angel a2 = new Angel("Rafael", EnumAngel.ARCANGEL, Categoria.PRIMERA_ESFERA);
        a2.agregarConteo(5);

        Angel a3 = new Angel("Gabriel", EnumAngel.ARCANGEL, Categoria.PRIMERA_ESFERA);

        Angel a4 = new Angel("Uriel", EnumAngel.ARCANGEL, Categoria.PRIMERA_ESFERA);
        a4.agregarConteo(100); a4.agregarConteo(50); a4.agregarConteo(25);

        Angel a5 = new Angel("Chamuel", EnumAngel.ARCANGEL, Categoria.PRIMERA_ESFERA);
        a5.agregarConteo(7); a5.agregarConteo(14);

        // Llenar el Stack con los 5 objetos
        stackAngeles.push(a1);
        stackAngeles.push(a2);
        stackAngeles.push(a3);
        stackAngeles.push(a4);
        stackAngeles.push(a5);

        // Crear la JerarquiaAngelical con los mismos Enums y meter los 5 objetos al Deque
        jerarquia = new JerarquiaAngelical("Corte Celestial", EnumAngel.ARCANGEL, Categoria.PRIMERA_ESFERA);
        jerarquia.agregarAngel(a1);
        jerarquia.agregarAngel(a2);
        jerarquia.agregarAngel(a3);
        jerarquia.agregarAngel(a4);
        jerarquia.agregarAngel(a5);
    }

    public Stack<Angel> getStackAngeles() { return stackAngeles; }
    public JerarquiaAngelical getJerarquia() { return jerarquia; }
}