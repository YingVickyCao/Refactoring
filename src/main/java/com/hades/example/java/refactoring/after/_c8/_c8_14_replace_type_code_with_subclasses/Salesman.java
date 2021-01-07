package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class Salesman extends Employee{
    protected Salesman() {
        super();
    }

    @Override
    public int getType() {
        return Employee.SALESMAN;
    }

    @Override
    public int getTotalVocationDay() {
        return 16;
    }
}
