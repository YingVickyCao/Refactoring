package com.hades.example.java.refactoring.before._c6_3_inline_temp;

public class Example {
    private final Order order = new Order(10);

    public boolean isBigPrice() {
        double basePrice = order.basePrice();
        return basePrice > 1000;
    }
}