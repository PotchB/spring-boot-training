package com.dopveb.imdb_top_shows.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopShowsController {
    @GetMapping
    public String getShows() {
        return "shows";
    }
}