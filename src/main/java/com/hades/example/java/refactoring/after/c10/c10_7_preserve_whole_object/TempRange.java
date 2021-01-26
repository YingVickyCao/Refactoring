package com.hades.example.java.refactoring.after.c10.c10_7_preserve_whole_object;

public class TempRange {
    int low = -2;
    int high = 15;

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    boolean includes(TempRange arg) {
        return arg.getLow() >= this.getLow() && arg.getHigh() <= this.getHigh();
    }
}