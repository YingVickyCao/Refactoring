package com.hades.example.java.refactoring.after.c1.movie.v11.price;

public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(final int daysRented);

    //    public int getFrequentRenterPoints(final int daysRented) {
//        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
//            return 2;
//        } else {
//            return 1;
//        }
//    }
    public int getFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}