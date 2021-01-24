package com.hades.example.java.refactoring.after.c10.c10_6_replace_parameter_with_explicit_methods;

public class Employee {
    static Employee createEngineer() {
        return new Engineer();
    }

    static Employee createSalesman() {
        return new Salesman();
    }

    static Employee createManager() {
        return new Manager();
    }
}