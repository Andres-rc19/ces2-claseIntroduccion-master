package com.ces2.clase0.controladores;

import com.ces2.clase0.modelos.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AngelControlador {

    @GetMapping("/angeles")
    public String mostrarAngeles(Model model) {
        Angel a1 = new Angel("Gabriel", "Llevar mensaje");
        Angel a2 = new Angel("Rafael", "Sanación");
        Angel a3 = new Angel("Uriel", "Iluminar");

        // Crear 9 tipos diferentes de objetos usando polimorfismo[cite: 2]
        SerAngelical obj1 = new ArcangelMiguel(a1);
        SerAngelical obj2 = new SerAfer(a2);
        SerAngelical obj3 = new AngelitoTravieso(a3);
        SerAngelical obj4 = new ArcangelMiguel(a2);
        SerAngelical obj5 = new SerAfer(a3);
        SerAngelical obj6 = new AngelitoTravieso(a1);
        SerAngelical obj7 = new ArcangelMiguel(a3);
        SerAngelical obj8 = new SerAfer(a1);
        SerAngelical obj9 = new AngelitoTravieso(a2);

        SerAngelical[] todos = {obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9};
        List<String> resultados = new ArrayList<>();
        
        // Iterar para hacer que cada objeto muestre los tres mensajes[cite: 2]
        for (SerAngelical ser : todos) {
            resultados.add("--------------------------------");
            resultados.add(ser.obtenerNombre(a1));
            resultados.add(ser.volar(a1));
            resultados.add(ser.realizarMision(a1));
        }

        model.addAttribute("mensajes", resultados);
        return "vistaAngeles";
    }
}