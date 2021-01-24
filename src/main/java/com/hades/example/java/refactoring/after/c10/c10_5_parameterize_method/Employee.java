package com.hades.example.java.refactoring.after.c10.c10_5_parameterize_method;

public class Employee {
    private double salary = 100D;

    void raise(double factor) {
        salary *= (1 + factor);
    }

    public double getSalary() {
        return salary;
    }
}