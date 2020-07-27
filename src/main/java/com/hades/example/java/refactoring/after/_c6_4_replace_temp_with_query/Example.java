package com.hades.example.java.refactoring.after._c6_4_replace_temp_with_query;

public class Example {
    private int itemPrice = 10;
    private int quantity = 2;
//    private double discountFactor;

    // Step 1:basePrice()
//    public double getPrice() {
//        final double basePrice = basePrice();
//        if (basePrice() > 1000) {
//            discountFactor = 0.95;
//        } else {
//            discountFactor = 0.98;
//        }
//        return basePrice() * discountFactor;
//    }

    // Step 2:discountFactor()
//    public double getPrice() {
//        discountFactor = discountFactor();
//        return basePrice() * discountFactor;
//    }

    // Step 3 : discountFactor
    public double getPrice() {
        return basePrice() * discountFactor();
    }

    // TODO:Check side effect: itemPrice++ / ++itemPrice
    private double basePrice() {
        return itemPrice * quantity;
    }

    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }
}