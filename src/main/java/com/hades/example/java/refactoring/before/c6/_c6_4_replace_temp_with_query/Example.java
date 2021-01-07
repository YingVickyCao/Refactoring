package com.hades.example.java.refactoring.before.c6._c6_4_replace_temp_with_query;

public class Example {
    private int itemPrice = 10;
    private int quantity = 2;
    private double discountFactor;

    public double getPrice() {
        double basePrice = itemPrice * quantity;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}