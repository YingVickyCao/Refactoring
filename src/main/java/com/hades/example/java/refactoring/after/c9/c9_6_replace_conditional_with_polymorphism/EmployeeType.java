package com.hades.example.java.refactoring.after.c9.c9_6_replace_conditional_with_polymorphism;


abstract class EmployeeType {
    static final int MANAGER = 2;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;

    abstract int getTypeCode();

    //    int getPayAmount(Employee employee) {
//        switch (getTypeCode()) {
//            case EmployeeType.ENGINEER:
//                return employee.getMonthSalary();
//
//            case EmployeeType.MANAGER:
//                return employee.getMonthSalary() + employee.getCommission();
//
//            case EmployeeType.SALESMAN:
//                return employee.getMonthSalary() + employee.getBonus();
//
//            default:
//                throw new IllegalArgumentException("Incorrect employee");
//        }
//    }
    abstract int getPayAmount(Employee employee);
}