package com.codeclan.example.movie;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setGenre() {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setRanking() {
        this.ranking = ranking;
    }

    public int getRanking() {
        return this.ranking;
    }

    public String toString() {
        return "Title: '" + this.title + "', Genre: '" + this.genre + "', Ranking: " + this.ranking;
    }
}
