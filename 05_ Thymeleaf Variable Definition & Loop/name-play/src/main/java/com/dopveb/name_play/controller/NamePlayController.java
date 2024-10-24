package com.dopveb.name_play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NamePlayController {
    @GetMapping
    public String displayNameinListBasedOnLength(Model model) {
        model.addAttribute("name", "Potch");
        return "view";
    }
}