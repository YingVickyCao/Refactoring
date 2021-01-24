package com.hades.example.java.refactoring.before.c10.c10_5_parameterize_method;

public class Change {
    double baseCharge() {//  SESSION:
        double result = Math.min(lastUsage(), 100) * 0.03;
        if (lastUsage() > 100) {
            result = (Math.min(lastUsage(), 200) - 100) * 0.05;
        }

        if (lastUsage() > 200) {
            result = (lastUsage() - 200) * 0.07;
        }
        return result;
    }

    private int lastChange() {
        return 10;
    }

    private int lastUsage() {
        return 50;
    }
}