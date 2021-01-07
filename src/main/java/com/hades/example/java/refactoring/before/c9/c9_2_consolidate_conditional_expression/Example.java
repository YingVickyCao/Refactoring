package com.hades.example.java.refactoring.before.c9.c9_2_consolidate_conditional_expression;

public class Example {
    private int _seniority = 5;
    private int _monthsDisabled = 15;
    private boolean _isPartTime = false;

    private double disabilityAmount() {
        if (_seniority < 2) {
            return 0;
        }
        if (_monthsDisabled > 12) {
            return 0;
        }
        if (_isPartTime) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Example example = new Example();
        double amount = example.disabilityAmount();
        System.out.println(amount);
    }
}
