package com.hades.example.java.refactoring.after.c8.c8_1_self_encapsulate_field;

public class IntRange {
    private int low;
    private int high;

    // Way 1 :
//    public IntRange(int low, int high) {
//        this.low = low;
//        this.high = high;
//    }

    // Way 2 :
    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    boolean includes(int arg) {
        return getLow() <= arg && arg <= getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setLow(int low) {
        this.low = low;
    }
}