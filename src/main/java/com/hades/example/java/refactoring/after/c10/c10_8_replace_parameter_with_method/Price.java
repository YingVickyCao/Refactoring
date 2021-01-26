package com.hades.example.java.refactoring.after.c10.c10_8_replace_parameter_with_method;

public class Price {
    private int _quantity = 5;
    private int _itemPrice = 100;

    public double getPrice() {
        return discountedPrice();
    }

    private double discountedPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    // 折扣等级
    int getDiscountLevel() {
        return _quantity > 100 ? 2 : 1;
    }

    int getBasePrice() {
        return _quantity * _itemPrice;
    }
}