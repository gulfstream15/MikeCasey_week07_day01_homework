package com.codeclan.example.movie;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void hasTitle() {
        Movie movie = new Movie("La La Land", "Musical", 1);
        assertEquals("La La Land", movie.getTitle());
    }

    @Test
    public void hasGenre() {
        Movie movie = new Movie("La La Land", "Musical", 1);
        assertEquals("Musical", movie.getGenre());
    }

    @Test
    public void hasRanking() {
        Movie movie = new Movie("La La Land", "Musical", 1);
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void hasMovieDetails() {
        Movie movie = new Movie("La La Land", "Musical", 1);
        assertEquals("Title: 'La La Land', Genre: 'Musical', Ranking: 1", movie.toString());
    }

}