package com.hades.example.java.refactoring.before._c6_7_remove_assignments_to_parameters;

public class Date {
    int date;

    public Date(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date @" + hashCode() + "{" +
                "date=" + date +
                '}';
    }
}
