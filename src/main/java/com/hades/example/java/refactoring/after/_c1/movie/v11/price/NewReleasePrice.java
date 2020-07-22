package com.hades.example.java.refactoring.after._c1.movie.v11.price;

import com.hades.example.java.refactoring.after._c1.movie.v11.Movie;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(final int daysRented) { // each -> rental
        double result = 0;
        result += daysRented * 3;
        return result;
    }
}
