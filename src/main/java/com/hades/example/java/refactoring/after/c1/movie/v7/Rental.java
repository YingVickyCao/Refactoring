package com.hades.example.java.refactoring.after.c1.movie.v7;

public class Rental {
    private Movie _movie; // 影片
    private int _daysRented; // 租期

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getCharge(Rental each) { // each -> rental
        return _movie.getCharge(each.getDaysRented());
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        // add frequent renter points （累计常客积点。
        frequentRenterPoints++;

        // add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}