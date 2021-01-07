package com.hades.example.java.refactoring.after._c8._c8_15_replace_type_code_with_state_or_strategy;

abstract class EmployeeType {
    static final int MANAGER = 2;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;

    abstract int getTypeCode();
}
