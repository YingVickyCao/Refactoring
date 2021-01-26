package com.hades.example.java.refactoring.before.c10.c10_9_introduce_parameter_object;

public class Date {
    int date;

    public Date(int date) {
        this.date = date;
    }

    public int getValue() {
        return date;
    }

    boolean before(Date value) {
        return this.date < value.getValue();
    }

    boolean after(Date value) {
        return this.date > value.getValue();
    }

    @Override
    public String toString() {
        return "Date @" + hashCode() + "{" +
                "date=" + date +
                '}';
    }
}
