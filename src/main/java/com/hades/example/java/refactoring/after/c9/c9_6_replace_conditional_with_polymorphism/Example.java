package com.hades.example.java.refactoring.after.c9.c9_6_replace_conditional_with_polymorphism;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee(EmployeeType.SALESMAN);
//        System.out.println(employee.getType());
        System.out.println(employee.getPayAmount());

        employee.setType(EmployeeType.ENGINEER);
//        System.out.println(employee.getType());
        System.out.println(employee.getPayAmount());
    }
}