package com.codeclan.example.movie;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22/05/2017.
 */

public class RankingTest {

    @Test
    public void moviesAreNotNull() {
        Ranking ranking = new Ranking();
        assertNotNull(ranking.getMovies());
    }

    @Test
    public void hasFiveMoviesByDefault() {
        Ranking ranking = new Ranking();
        assertEquals(5, ranking.getNumberOfMovies());
    }

    @Test
    public void canAddMovie() {
        Ranking ranking = new Ranking();
        Movie movie6 = new Movie("Groundhog Day", "Comedy", 6);
        ranking.addMovie(movie6);
        assertEquals(6, ranking.getNumberOfMovies());
    }

    @Test
    public void canGetMovieAtIndex() {
        Ranking ranking = new Ranking();
        Movie movie = ranking.getMovieAtIndex(0);
        assertEquals("Title: 'La La Land', Genre: 'Musical', Ranking: 1", movie.toString());
    }

    @Test
    public void replaceMovieAtEnd() {
        Ranking ranking = new Ranking();
        int endindex = (ranking.getNumberOfMovies() - 1);
        Movie newmovie = new Movie("Groundhog Day", "Comedy", 5);
        ranking.replaceMovieAtIndex(endindex, newmovie);
        assertEquals("Title: 'Groundhog Day', Genre: 'Comedy', Ranking: 5", newmovie.toString());
    }

}
