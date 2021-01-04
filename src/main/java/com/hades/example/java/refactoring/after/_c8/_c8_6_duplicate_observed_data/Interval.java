package com.hades.example.java.refactoring.after._c8._c8_6_duplicate_observed_data;

import java.util.Observable;

public class Interval extends Observable {
    String end;
    String length;

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
        setChanged();
        notifyObservers();
    }
}