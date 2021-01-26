package com.hades.example.java.refactoring.after.c10.c10_7_preserve_whole_object;

public class HeatingPlan {
    TempRange _range = new TempRange();

    boolean withRange(TempRange roomRange) {
        return _range.includes(roomRange);
    }
}