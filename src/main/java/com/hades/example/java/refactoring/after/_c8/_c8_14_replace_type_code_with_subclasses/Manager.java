package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class Manager extends Employee{
    protected Manager() {
        super();
    }

    @Override
    public int getType() {
        return Employee.MANAGER;
    }

    @Override
    public int getTotalVocationDay() {
        return 17;
    }
}
