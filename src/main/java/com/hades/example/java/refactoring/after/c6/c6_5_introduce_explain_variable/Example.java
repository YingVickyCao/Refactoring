package com.hades.example.java.refactoring.after.c6.c6_5_introduce_explain_variable;

public class Example {
    private int _quantity = 10;
    private int _itemPrice = 20;

//    double price() {
//        return _quantity * _itemPrice
//                - Math.max(0, _quantity - 50) * _itemPrice * 0.05
//                + Math.min(_quantity * _itemPrice * 0.01, 100.00);
//    }

    // Step 1: basePrice
//    double price() {
//        final double basePrice = _quantity * _itemPrice;
//        return basePrice
//                - Math.max(0, _quantity - 50) * _itemPrice * 0.05
//                + Math.min(basePrice * 0.01, 100.00);
//    }

    // Step 2 : quantityDiscount
//    double price() {
//        final double basePrice = _quantity * _itemPrice;
//        final double quantityDiscount = Math.max(0, _quantity - 50) * _itemPrice * 0.05;
//        return basePrice
//                - quantityDiscount
//                + Math.min(basePrice * 0.01, 100.00);
//    }

    // Step 3 : shipping
    double price() {
        final double basePrice = _quantity * _itemPrice;
        final double quantityDiscount = Math.max(0, _quantity - 50) * _itemPrice * 0.05;
        final double shipping = Math.min(basePrice * 0.01, 100.00);
        return basePrice - quantityDiscount + shipping;
    }
}
