package com.hades.example.java.refactoring.before.c9._c9_6_replace_conditional_with_polymorphism;

class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}
