package com.hades.example.java.refactoring.after.c6.c6_3_inline_temp;

public class Order {
    private double basePrice;

    public Order(double basePrice) {
        this.basePrice = basePrice;
    }

    double basePrice() {
        return basePrice;
    }
}