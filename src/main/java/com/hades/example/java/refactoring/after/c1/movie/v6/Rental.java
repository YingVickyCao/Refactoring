package com.hades.example.java.refactoring.after.c1.movie.v6;

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
        double thisAmount = 0;
        switch (each.getMovie().getPriceCode()) { // 取得影片出租价格
            case Movie.REGULAR: // 普通片
                thisAmount += 2;
                if (each.getDaysRented() > 2)
                    thisAmount += (each.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE: // 新片
                thisAmount += each.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS: // 儿童。
                thisAmount += 1.5;
                if (each.getDaysRented() > 3)
                    thisAmount += (each.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
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