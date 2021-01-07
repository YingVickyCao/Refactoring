package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class Engineer extends Employee{
    protected Engineer() {
        super();
    }

    @Override
    public int getType() {
        return Employee.ENGINEER;
    }

    @Override
    public int getTotalVocationDay() {
        return 15;
    }
}
