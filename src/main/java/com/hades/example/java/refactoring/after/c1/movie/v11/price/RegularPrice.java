package com.hades.example.java.refactoring.after.c1.movie.v11.price;

import com.hades.example.java.refactoring.after.c1.movie.v11.Movie;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(final int daysRented) { // each -> rental
        double result = 0;
        result += 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}