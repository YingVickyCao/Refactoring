package com.hades.example.java.refactoring.before.c6._c6_3_inline_temp;

public class Order {
    private double basePrice;

    public Order(double basePrice) {
        this.basePrice = basePrice;
    }

    double basePrice() {
        return basePrice;
    }
}