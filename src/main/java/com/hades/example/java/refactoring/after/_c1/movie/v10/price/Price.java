package com.hades.example.java.refactoring.after._c1.movie.v10.price;

import com.hades.example.java.refactoring.after._c1.movie.v10.Movie;

public abstract class Price {
    public abstract int getPriceCode();

    public double getCharge(final int daysRented) { // each -> rental
        double thisAmount = 0;
        switch (getPriceCode()) { // 取得影片出租价格
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