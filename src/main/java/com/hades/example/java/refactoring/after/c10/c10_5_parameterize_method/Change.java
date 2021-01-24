package com.hades.example.java.refactoring.after.c10.c10_5_parameterize_method;

public class Change {
    double baseCharge() {//  SESSION:
        double result = usageInRange(0, 100) * 0.03;
        result += usageInRange(100, 200) * 0.05;
        result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
        return result;
    }

    double usageInRange(int start, int end) {
        if (lastUsage() > start) {
            return Math.min(lastUsage(), end) - start;
        }
        return 0;
    }

    private int lastChange() {
        return 10;
    }

    private int lastUsage() {
        return 50;
    }
}
