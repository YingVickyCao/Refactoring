package com.hades.example.java.refactoring.before._c8._c8_14_replace_type_code_with_subclasses;

public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int type) {
        _type = type;
    }

    public int getType() {
        return _type;
    }

    int getTotalVocationDay() {
        switch (_type) {
            case ENGINEER:
                return 15;
            case MANAGER:
                return 17;
            case SALESMAN:
                return 16;
            default:
                return 10;
        }
    }
}