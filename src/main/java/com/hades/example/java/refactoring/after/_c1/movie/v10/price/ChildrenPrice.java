package com.hades.example.java.refactoring.after._c1.movie.v10.price;

import com.hades.example.java.refactoring.after._c1.movie.v10.Movie;

public class ChildrenPrice extends AbstractPrice {
    @Override
    public int getPrice() {
        return Movie.CHILDRENS;
    }
}
