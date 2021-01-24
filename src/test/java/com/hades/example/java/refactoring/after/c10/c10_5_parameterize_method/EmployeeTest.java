package com.hades.example.java.refactoring.after.c10.c10_5_parameterize_method;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void test(){
        Employee employee = new Employee();
        employee.raise(0.05);
        Assert.assertEquals(105.0, employee.getSalary(), 105);

        Employee employee2 = new Employee();
        employee2.raise(0.1);
        Assert.assertEquals(105.0, employee2.getSalary(), 105);
    }
}