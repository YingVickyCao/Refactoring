package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class Example {
    public static void main(String[] args) {
        Employee employee = Employee.create(Employee.SALESMAN);
        System.out.println(employee.getType());
        System.out.println(employee.getTotalVocationDay());

        Employee employee2 = Employee.create(Employee.MANAGER);
        System.out.println(employee2.getType());
        System.out.println(employee2.getTotalVocationDay());

        Employee employee3 = Employee.create(Employee.ENGINEER);
        System.out.println(employee3.getType());
        System.out.println(employee3.getTotalVocationDay());
    }
}
