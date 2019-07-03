package com.escalade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccueilController {

    @RequestMapping(value = "/")
    public String accueil(Model model) {
        String prenom = "Elodie";
    model.addAttribute("prenom", prenom);
        return "accueil";
    }
}
