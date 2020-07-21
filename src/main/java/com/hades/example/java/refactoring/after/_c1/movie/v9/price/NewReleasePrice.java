package com.hades.example.java.refactoring.after._c1.movie.v9.price;

import com.hades.example.java.refactoring.after._c1.movie.v9.Movie;

public class NewReleasePrice extends AbstractPrice {
    @Override
    public int getPrice() {
        return Movie.NEW_RELEASE;
    }
}
