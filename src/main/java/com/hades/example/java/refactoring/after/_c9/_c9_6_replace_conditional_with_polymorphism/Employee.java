package com.hades.example.java.refactoring.after._c9._c9_6_replace_conditional_with_polymorphism;

class Employee {
    private EmployeeType _type;

    private int _monthSalary = 100;
    private int _bonus = 50;
    private int _commission = 10; // 佣金

    Employee(int type) {
        setType(type);
    }

    int getType() {
        return _type.getTypeCode();
    }

    void setType(int type) {
        switch (type) {
            case EmployeeType.ENGINEER:
                _type = new Engineer();
                break;

            case EmployeeType.MANAGER:
                _type = new Manager();
                break;
            case EmployeeType.SALESMAN:
                _type = new Salesman();
                break;

            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

//    int getPayAmount() {
//        switch (getType()) {
//            case EmployeeType.ENGINEER:
//                return _monthSalary;
//
//            case EmployeeType.MANAGER:
//                return _monthSalary + _commission;
//
//            case EmployeeType.SALESMAN:
//                return _monthSalary + _bonus;
//
//            default:
//                throw new IllegalArgumentException("Incorrect employee");
//        }
//    }

    int getPayAmount() {
        return _type.getPayAmount(this);
    }

    public int getMonthSalary() {
        return _monthSalary;
    }

    public int getBonus() {
        return _bonus;
    }

    public int getCommission() {
        return _commission;
    }
}