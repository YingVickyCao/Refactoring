package com.hades.example.java.refactoring.before.c8.c8_1_self_encapsulate_field;

public class IntRange {
    private int low;
    private int high;

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;

        // OR
//        init(low, high);
    }

    private void init(int low, int high) {
        this.low = low;
        this.high = high;
    }

    boolean includes(int arg) {
        return low <= arg && arg <= high;
    }

    void grow(int factor) {
        high = high * factor;
    }
}
