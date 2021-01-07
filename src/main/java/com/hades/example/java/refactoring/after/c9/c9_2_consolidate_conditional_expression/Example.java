package com.hades.example.java.refactoring.after.c9.c9_2_consolidate_conditional_expression;

public class Example {
    private int _seniority = 5;
    private int _monthsDisabled = 15;
    private boolean _isPartTime = false;

    private double disabilityAmount() {
        return isNotEligibleForDisability() ? 0 : 1;
    }

    private boolean isNotEligibleForDisability() {
        return (_seniority < 2) || (_monthsDisabled > 12 || _isPartTime);
    }

    public static void main(String[] args) {
        Example example = new Example();
        double amount = example.disabilityAmount();
        System.out.println(amount);
    }
}
