package com.dopveb.imdb_top_shows.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dopveb.imdb_top_shows.pojo.Show;

@Controller
public class TopShowsController {
    
    private Map<String, List<Show>> model = new HashMap<>();
    private List<Show> shows = new ArrayList<>();

    @GetMapping
    public ModelAndView getShows() {
        shows.add(new Show("Breaking Bad", "Ozymandias", 10.0));
        shows.add(new Show("Attack on Titan", "Perfect Game", 9.9));
        shows.add(new Show("Attack on Titan", "Perfect Game", 9.9));
        shows.add(new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        shows.add(new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));
        model.put("shows", shows);
        return new ModelAndView("shows", model);
    }
}