package com.hades.example.java.refactoring.after._c1.movie.v7;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public void setPriceCode(int priceCode) {
        _priceCode = priceCode;
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
}