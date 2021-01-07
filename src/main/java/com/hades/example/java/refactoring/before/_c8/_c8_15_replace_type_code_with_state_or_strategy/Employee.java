package com.hades.example.java.refactoring.before._c8._c8_15_replace_type_code_with_state_or_strategy;

class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int _type;

    private int _monthSalary = 100;
    private int _bonus = 50;
    private int _commission = 10; // 佣金

    Employee(int type) {
        _type = type;
    }

    int getType() {
        return _type;
    }

    void setType(int type) {
        _type = type;
    }

    int getPayAmount() {
        switch (_type) {
            case ENGINEER:
                return _monthSalary;

            case MANAGER:
                return _monthSalary + _commission;

            case SALESMAN:
                return _monthSalary + _bonus;

            default:
                throw new IllegalArgumentException("Incorrect employee");
        }
    }
}