package com.hades.example.java.refactoring.before.c7._c7_5_hide_delegate;

public class Example {
    public void test() {
        Person person = new Person();
        Department department = new Department(person);
        person.setDepartment(department);

        // 知道一个人的经理是谁？对客户暴露了Department的工作原理
        person.getDepartment().getManager();
    }
}