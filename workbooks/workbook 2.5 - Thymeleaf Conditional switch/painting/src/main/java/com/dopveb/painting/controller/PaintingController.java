package com.dopveb.painting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PaintingController {
    @GetMapping
    public String getPainting(Model model) {
        // model.addAttribute("painting", "mona-lisa");
        model.addAttribute("painting", "starry-night");
        return "painting";
    }
}
