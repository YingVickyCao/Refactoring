package com.hades.example.java.refactoring.after._c1.movie.v11.price;

import com.hades.example.java.refactoring.after._c1.movie.v11.Movie;

public class ChildrenPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(final int daysRented) {
        double result = 0;
        result += 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }


}