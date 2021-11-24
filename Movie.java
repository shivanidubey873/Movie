package com.tw.Movie;

import java.util.Objects;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] movieArray) {
        Movie[] pgRatedMovies;
        pgRatedMovies = new Movie[movieArray.length];
        int pgMovieCount = 0;
        for (Movie movie : movieArray) {
            if (Objects.equals(movie.rating, "PG")) {
                pgRatedMovies[pgMovieCount] = new Movie(movie.title, movie.studio);
                pgMovieCount += 1;
            }
        }
        return pgRatedMovies;
    }

    public String getRating() {
        return rating;
    }

    public String getStudio() {
        return studio;
    }

    public String getTitle() {
        return title;
    }
}
