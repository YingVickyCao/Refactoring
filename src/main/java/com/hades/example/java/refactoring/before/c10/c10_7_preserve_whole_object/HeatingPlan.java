package com.hades.example.java.refactoring.before.c10.c10_7_preserve_whole_object;

public class HeatingPlan {
    TempRange _range = new TempRange();

    boolean withRange(int low, int high) {
        return low >= _range.getLow() && high <= _range.getHigh();
    }
}