package com.dopveb.sales_analysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesAnalysis {
    @GetMapping
    public String showSalesAnalysis(Model model) {
        model.addAttribute("sales", 30);
        // model.addAttribute("sales", 100);
        model.addAttribute("product", "chair");
        return "sales";
    }
}