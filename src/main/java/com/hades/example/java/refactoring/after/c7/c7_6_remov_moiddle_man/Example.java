package com.hades.example.java.refactoring.after.c7.c7_6_remov_moiddle_man;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    class Person {
        private Department _department;

        public Person() {
        }
        // SESSION:移除委托函数,START
//        public Manager getManager() {
//            return _department.getManager();
//        }
//        public String getDepartmentName() {
//            return _department.getDepartmentName();
//        }

        public Department getDepartment() {
            return _department;
        }
        // SESSION:移除委托函数,END

        public void setDepartment(Department department) {
            _department = department;
        }
    }

    class Manager extends Person {
    }

    class Department {
        private Manager manager;
        private String departmentName = "Mock Department name";

        public Department(Manager manager) {
            this.manager = manager;
        }

        public Manager getManager() {
            return manager;
        }

        public String getDepartmentName() {
            return departmentName;
        }
    }

    private void test() {
        Manager manager = new Manager();
        Department department = new Department(manager);

        Person person = new Person();
        person.setDepartment(department);

        // 找出某人的经理
        // SESSION:移除委托函数,START
//        person.getManager();
//        person.getDepartmentName();
        Department department2 = person.getDepartment();
        department2.getManager();
        department2.getDepartmentName();
        // SESSION:移除委托函数,END
    }
}
