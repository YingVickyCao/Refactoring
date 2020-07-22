package com.hades.example.java.refactoring.after._c1.movie.v11;

import com.hades.example.java.refactoring.after._c1.movie.v11.price.ChildrenPrice;
import com.hades.example.java.refactoring.after._c1.movie.v11.price.NewReleasePrice;
import com.hades.example.java.refactoring.after._c1.movie.v11.price.Price;
import com.hades.example.java.refactoring.after._c1.movie.v11.price.RegularPrice;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String _title;
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
    public double getCharge(final int daysRented) {
        return _price.getCharge(daysRented);
    }
}