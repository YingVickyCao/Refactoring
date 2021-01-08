package com.hades.example.java.refactoring.before.c9.c9_5_replace_nested_conditional_with_guard_clauses;

public class Capital {
    double _capital = 5;
    double _intRate = 1.5;
    double _duration = 6.0;
    double _income = 1000;
    int ADJ_FACTOR = 10;

    /**
     * Case 1: 条件反转 -> 卫语句
     */
    public double getAdjustedCapital() {
        double result = 0.0;
        if (_capital > 0.0) {
            if (_intRate > 0.0 && _duration > 0.0) {
                result = (_income / _duration) * ADJ_FACTOR;
            }
        }
        return result;
    }
}