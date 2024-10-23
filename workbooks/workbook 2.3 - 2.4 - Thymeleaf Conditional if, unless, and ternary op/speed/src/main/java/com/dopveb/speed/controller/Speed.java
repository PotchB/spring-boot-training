package com.dopveb.speed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Speed {
    @GetMapping
    public String getSpeed(Model model) {
        model.addAttribute("speed", 35);
        return "sign";
    }
    
}
