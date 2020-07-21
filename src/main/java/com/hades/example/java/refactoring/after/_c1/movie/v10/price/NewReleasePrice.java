package com.hades.example.java.refactoring.after._c1.movie.v10.price;

import com.hades.example.java.refactoring.after._c1.movie.v10.Movie;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
