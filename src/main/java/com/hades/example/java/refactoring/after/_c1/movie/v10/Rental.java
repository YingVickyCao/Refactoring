package com.hades.example.java.refactoring.after._c1.movie.v10;

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
        return _movie.getFrequentRenterPoints(getDaysRented());
    }
}