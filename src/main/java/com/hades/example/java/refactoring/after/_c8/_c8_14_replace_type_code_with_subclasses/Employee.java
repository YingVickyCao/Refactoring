package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public abstract class Employee {
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
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    protected Employee() {
    }

    public abstract int getType();

    public abstract int getTotalVocationDay();
}
