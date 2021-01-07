package com.hades.example.java.refactoring.after.c1.movie.v8.price;

import com.hades.example.java.refactoring.after.c1.movie.v8.Movie;

public class ChildrenPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
