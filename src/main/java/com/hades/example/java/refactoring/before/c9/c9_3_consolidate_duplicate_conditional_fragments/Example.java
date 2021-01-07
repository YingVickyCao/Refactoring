package com.hades.example.java.refactoring.before.c9.c9_3_consolidate_duplicate_conditional_fragments;

public class Example {
    private double _total;
    private double _price = 15;

    double getTotal() {
        if (isSpecialDeal()) {
            _total = _price * 0.95;
            send();
        } else {
            _total = _price * 0.98;
            send();
        }
        return _total;
    }

    boolean isSpecialDeal() {
        return true;
    }

    void send() {
        System.out.println(_total);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.getTotal();
    }
}
