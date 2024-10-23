package com.dopveb.milk_tea_cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MilkTeaCafeAppController {
    @GetMapping
    public String getMethodName(Model model) {
        model.addAttribute("menu", "We sell chocolate, rice cakes, and bubble tea");
        return "view";
    }
}