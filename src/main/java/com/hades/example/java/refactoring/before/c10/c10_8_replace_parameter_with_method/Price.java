package com.hades.example.java.refactoring.before.c10.c10_8_replace_parameter_with_method;

public class Price {
    private int _quantity = 5;
    private int _itemPrice = 100;

    public double getPrice() {
        int basePrice = _quantity * _itemPrice; // SESSION:

        // SESSION:
        int disCountLevel; // 折扣等级
        if (_quantity > 100) {
            disCountLevel = 2;
        } else {
            disCountLevel = 1;
        }
        // 去掉非必要的临时变量
        double finalPrice = discountedPrice(basePrice, disCountLevel);
        return finalPrice;
    }

    private double discountedPrice(int basePrice, int discountLevel) {
        if (discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }
}
