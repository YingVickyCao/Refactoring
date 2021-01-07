package com.hades.example.java.refactoring.after.c1.movie.v8.price;

import com.hades.example.java.refactoring.after.c1.movie.v8.Movie;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
