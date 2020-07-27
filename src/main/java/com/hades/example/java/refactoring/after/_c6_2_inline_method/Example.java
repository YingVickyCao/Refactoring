package com.hades.example.java.refactoring.after._c6_2_inline_method;

public class Example {
    int _numberOfFiveLateDeliveries = 1;

    public void setNumberOfFiveLateDeliveries(int numberOfFiveLateDeliveries) {
        _numberOfFiveLateDeliveries = numberOfFiveLateDeliveries;
    }

    public int getRating() {
        return _numberOfFiveLateDeliveries > 5 ? 2 : 1;
    }
}