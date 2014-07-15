package com.thoughtworks;

/**
 * Created by apoorvam on 7/15/14.
 */
public class Movies implements Item {
    public String movieName;
    public int movieYear;
    public String movieDirector;
    public int movieRating;
    public boolean available;

    Movies() {
    }

    Movies(String movieName, int movieYear, String movieDirector, int movieRating, boolean available) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
        this.available = available;
    }

    @Override
    public boolean matches(String query) {
        return this.movieName.equals(query) && this.available;
    }
}
