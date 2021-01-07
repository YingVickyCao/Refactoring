package com.hades.example.java.refactoring.before.c6.c6_2_inline_method;

public class Example {
    int _numberOfFiveLateDeliveries = 1;

    public void setNumberOfFiveLateDeliveries(int numberOfFiveLateDeliveries) {
        _numberOfFiveLateDeliveries = numberOfFiveLateDeliveries;
    }

    public int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return _numberOfFiveLateDeliveries > 5;
    }
}