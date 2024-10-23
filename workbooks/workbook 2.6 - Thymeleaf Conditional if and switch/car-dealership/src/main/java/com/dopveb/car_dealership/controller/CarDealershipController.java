package com.dopveb.car_dealership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CarDealershipController {
    
    @GetMapping
    public String getCarBasedOnBudget(Model model) {
        model.addAttribute("budget", 5000);
        // model.addAttribute("make", "Toyota");
        // model.addAttribute("make", "Volkswagen");
        // model.addAttribute("make", "Ford");
        model.addAttribute("make", "Honda");
        // model.addAttribute("make", "Mitsubishi");
        return "car-dealer";
    }
}