package com.hades.example.java.refactoring.before.c9._c9_6_replace_conditional_with_polymorphism;

abstract class EmployeeType {
    static final int MANAGER = 2;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;

    abstract int getTypeCode();
}
