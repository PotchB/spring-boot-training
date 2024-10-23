package com.dopveb.imdb_top_shows.pojo;

import java.util.Objects;

public class Show {
    private String title;
    private String episode;
    private double rating;

    public Show() {
    }

    public Show(String title, String episode, double rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, episode, rating);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Show))
            return false;
        Show other = (Show) obj;
        return Objects.equals(title, other.title) && Objects.equals(episode, other.episode)
                && Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
    }

}
