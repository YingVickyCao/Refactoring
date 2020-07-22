package com.hades.example.java.refactoring.after._c1.movie.v8;

import com.hades.example.java.refactoring.after._c1.movie.v8.price.ChildrenPrice;
import com.hades.example.java.refactoring.after._c1.movie.v8.price.Price;
import com.hades.example.java.refactoring.after._c1.movie.v8.price.NewReleasePrice;
import com.hades.example.java.refactoring.after._c1.movie.v8.price.RegularPrice;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String _title;
    private int _priceCode;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public String getTitle() {
        return _title;
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case Movie.REGULAR: // 普通片
                _price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE: // 新片
                _price = new NewReleasePrice();
                break;
            case Movie.CHILDRENS: // 儿童。
                _price = new ChildrenPrice();
                break;
        }
    }

    public double getCharge(final int daysRented) { // each -> rental
        double thisAmount = 0;
        switch (_priceCode) { // 取得影片出租价格
            case Movie.REGULAR: // 普通片
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE: // 新片
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS: // 儿童。
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    public int getFrequentRenterPoints(final int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}