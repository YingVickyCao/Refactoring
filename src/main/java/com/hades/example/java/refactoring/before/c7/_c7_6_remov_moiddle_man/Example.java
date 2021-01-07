package com.hades.example.java.refactoring.before.c7._c7_6_remov_moiddle_man;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    class Person {
        private Department _department;

        public Person() {
        }

        // SESSION:委托函数
        public Manager getManager() {
            return _department.getManager();
        }

        // SESSION:委托函数
        public String getDepartmentName() {
            return _department.getDepartmentName();
        }

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

        // client 需要 找出某人的经理
        // SESSION:委托函数
        person.getManager();

        // SESSION:委托函数
        person.getDepartmentName();
    }
}
