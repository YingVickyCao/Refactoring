package com.hades.example.java.refactoring.after._c1.movie.v9.price;

import com.hades.example.java.refactoring.after._c1.movie.v9.Movie;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}
