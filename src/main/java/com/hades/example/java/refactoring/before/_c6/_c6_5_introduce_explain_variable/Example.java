package com.hades.example.java.refactoring.before._c6._c6_5_introduce_explain_variable;

public class Example {
    private int _quantity = 10;
    private int _itemPrice = 20;

    double price() {
        return _quantity * _itemPrice
                - Math.max(0, _quantity - 50) * _itemPrice * 0.05
                + Math.min(_quantity * _itemPrice * 0.01, 100.00);
    }
}
