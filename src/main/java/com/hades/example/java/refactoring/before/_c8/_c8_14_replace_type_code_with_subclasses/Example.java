package com.hades.example.java.refactoring.before._c8._c8_14_replace_type_code_with_subclasses;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee(Employee.SALESMAN);
        System.out.println(employee.getType());
        System.out.println(employee.getTotalVocationDay());

        Employee employee2 = new Employee(Employee.MANAGER);
        System.out.println(employee2.getType());
        System.out.println(employee2.getTotalVocationDay());

        Employee employee3 = new Employee(Employee.ENGINEER);
        System.out.println(employee3.getType());
        System.out.println(employee3.getTotalVocationDay());
    }
}
