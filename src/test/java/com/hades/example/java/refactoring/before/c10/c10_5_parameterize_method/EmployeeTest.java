package com.hades.example.java.refactoring.before.c10.c10_5_parameterize_method;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void test() {
        Employee employee = new Employee();
        employee.fivePercentRaise();
        Assert.assertEquals(105.0, employee.getSalary(), 105);

        Employee employee2 = new Employee();
        employee2.tenPercentRaise();
        System.out.println(employee2.getSalary());
        Assert.assertEquals(110.00000000000001, employee2.getSalary(), 110);
    }
}