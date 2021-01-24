package com.hades.example.java.refactoring.before.c10.c10_6_replace_parameter_with_explicit_methods;

public class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();

            case SALESMAN:
                return new Salesman();

            case MANAGER:
                return new Manager();

            default:
                throw new IllegalArgumentException("Incorrect type code value:" + type);
        }
    }
}