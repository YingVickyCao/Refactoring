package com.hades.example.java.refactoring.before.c10.c10_5_parameterize_method;

public class Employee {
    private double salary = 100D;

    void tenPercentRaise() { //  SESSION:
        salary *= 1.1;
    }

    void fivePercentRaise() { //  SESSION:
        salary *= 1.05;
    }

    public double getSalary() {
        return salary;
    }
}