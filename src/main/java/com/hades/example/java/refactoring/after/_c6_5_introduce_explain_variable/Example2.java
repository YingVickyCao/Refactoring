package com.hades.example.java.refactoring.after._c6_5_introduce_explain_variable;

public class Example2 {
    private int _quantity = 10;
    private int _itemPrice = 20;

    double price() {
        return basePrice() - quantityDiscount() + shipping();
    }

    private double basePrice() {
        return _quantity * _itemPrice;
    }

    private double quantityDiscount() {
        return Math.max(0, _quantity - 50) * _itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(basePrice() * 0.01, 100.00);
    }
}