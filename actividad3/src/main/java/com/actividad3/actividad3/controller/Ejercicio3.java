package com.actividad3.actividad3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ejercicio3 {

    @GetMapping("/elegir")
    public String elegirIdioma(@RequestParam(name = "idioma", required = false) String idioma) {
        if (idioma == null) {
            return "redirect:/english.html";
        }

        switch (idioma.toLowerCase()) {
            case "spanish":
                return "redirect:/spanish.html";
            case "french":
                return "redirect:/french.html";
            case "english":
                return "redirect:/english.html";
            case "german":
                return "redirect:/german.html";
            default:
                return "redirect:/english.html";
        }
    }
}