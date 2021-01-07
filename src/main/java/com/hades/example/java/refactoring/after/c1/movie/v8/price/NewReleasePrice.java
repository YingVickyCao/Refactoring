package com.hades.example.java.refactoring.after.c1.movie.v8.price;

import com.hades.example.java.refactoring.after.c1.movie.v8.Movie;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
