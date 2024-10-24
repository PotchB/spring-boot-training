package com.dopveb.grade_submission.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dopveb.grade_submission.pojo.Grade;

@Controller
public class GradeController {

    // List<Grade> grades = new ArrayList<>();
    List<Grade> grades = Arrays.asList(
        new Grade("Harry", "Potions", "C-"),
        new Grade("Hermione", "Transfiguration", "A+"),
        new Grade("Ron", "Herbology", "B-")
    );

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("grades", grades);
        return "grades";
    }
}