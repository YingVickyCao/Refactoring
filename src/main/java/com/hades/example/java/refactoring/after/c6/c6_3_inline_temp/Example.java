package com.hades.example.java.refactoring.after.c6.c6_3_inline_temp;

public class Example {
    private final Order order = new Order(10);
    
    public boolean isBigPrice() {
        return order.basePrice() > 1000;
    }
}