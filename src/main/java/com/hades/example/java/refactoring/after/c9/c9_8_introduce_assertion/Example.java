package com.hades.example.java.refactoring.after.c9.c9_8_introduce_assertion;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.setExpenseLimit(100);    // AssertionError
        employee.setExpenseLimit(Employee.NULL_EXPENSE);
        System.out.println(employee.getExpenseLimit());
    }
}
