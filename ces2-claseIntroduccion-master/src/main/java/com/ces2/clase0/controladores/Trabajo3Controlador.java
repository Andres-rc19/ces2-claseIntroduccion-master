package com.ces2.clase0.controladores;

import com.ces2.clase0.modelos.*;
import com.ces2.clase0.repositories.Trabajo3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
public class Trabajo3Controlador {

    @Autowired
    private Trabajo3Repository repo;

    @GetMapping("/t3-inicio")
    public String inicio() { return "vistaTrabajo3"; }

    // PUNTO 2: ListIterator e Iterator
    @GetMapping("/t3-punto2")
    public String punto2(Model model) {
        List<String> resultadosStack = new ArrayList<>();
        ListIterator<Angel> listIter = repo.getStackAngeles().listIterator();
        while(listIter.hasNext()) { resultadosStack.add(listIter.next().toString()); }

        List<String> resultadosDeque = new ArrayList<>();
        Iterator<Angel> iter = repo.getJerarquia().getAngeles().iterator();
        while(iter.hasNext()) { resultadosDeque.add(iter.next().toString()); }

        model.addAttribute("titulo", "Punto 2: Uso de ListIterator e Iterator");
        model.addAttribute("listaStack", resultadosStack);
        model.addAttribute("listaDeque", resultadosDeque);
        return "vistaTrabajo3";
    }

    // PUNTO 3: Programación Funcional sobre Deque filtrando por Enum[cite: 8]
    @GetMapping("/t3-punto3")
    public String punto3(Model model) {
        List<String> filtrados = repo.getJerarquia().getAngeles().stream()
                .filter(a -> a.getTipoAngel() == EnumAngel.ARCANGEL)
                .map(Angel::toString)
                .collect(Collectors.toList());

        model.addAttribute("titulo", "Punto 3: Filtrar Deque con Programación Funcional");
        model.addAttribute("listaResultados", filtrados);
        return "vistaTrabajo3";
    }

    // PUNTO 4: Function<T, R> para sumar el Stack de enteros[cite: 8]
    @GetMapping("/t3-punto4")
    public String punto4(Model model) {
        Function<Angel, Integer> sumarConteo = angel -> {
            int suma = 0;
            for(Integer num : angel.getConteo()) { suma += num; }
            return suma;
        };

        Angel primerAngel = repo.getStackAngeles().get(0);
        Integer suma = sumarConteo.apply(primerAngel);

        model.addAttribute("titulo", "Punto 4: Uso de Interface Function<T,R>");
        model.addAttribute("resultadoTexto", "Suma del Stack 'conteo' para " + primerAngel.getNombre() + ": " + suma);
        return "vistaTrabajo3";
    }

    // PUNTO 5: Método verTotales dentro de la clase[cite: 8]
    @GetMapping("/t3-punto5")
    public String punto5(Model model) {
        Function<Angel, Integer> sumarConteo = angel -> {
            int suma = 0;
            for(Integer num : angel.getConteo()) { suma += num; }
            return suma;
        };

        Angel cuartoAngel = repo.getStackAngeles().get(3);
        Integer total = cuartoAngel.verTotales(sumarConteo);

        model.addAttribute("titulo", "Punto 5: Método verTotales que recibe la Function");
        model.addAttribute("resultadoTexto", "Llamada a verTotales() en " + cuartoAngel.getNombre() + " -> Total: " + total);
        return "vistaTrabajo3";
    }
}