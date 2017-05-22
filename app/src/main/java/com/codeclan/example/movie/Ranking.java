package com.codeclan.example.movie;

import java.util.ArrayList;

/**
 * Created by user on 22/05/2017.
 */

public class Ranking {

    private ArrayList<Movie> movies;

    public Ranking() {
        this.movies = new ArrayList<>();
        setupMovieList();
    }

    public Ranking(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    private void setupMovieList() {
        // Create some movie objects
        Movie movie1 = new Movie("La La Land", "Musical", 1);
        Movie movie2 = new Movie("Prometheus", "Horror", 2);
        Movie movie3 = new Movie("The American", "Thriller", 3);
        Movie movie4 = new Movie("Blazing Saddles", "Comedy", 4);
        Movie movie5 = new Movie("Spectre", "Thriller", 5);
        Movie[] movieList = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5
        };
        for (Movie movie: movieList) {
            this.movies.add(movie);
        }
    }

    public ArrayList<Movie> getMovies() {
        return new ArrayList<>(this.movies);
    }

    public int getNumberOfMovies() {
        return this.movies.size();
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public Movie getMovieAtIndex(int i) {
        return this.movies.get(i);
    }

    public Movie replaceMovieAtIndex(int i, Movie movie) {
        return this.movies.set(i, movie);
    }

}
