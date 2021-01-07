package com.hades.example.java.refactoring.after.c6.c6_8_replace_method_with_method_object;

public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gama(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
        return 10;
    }
}