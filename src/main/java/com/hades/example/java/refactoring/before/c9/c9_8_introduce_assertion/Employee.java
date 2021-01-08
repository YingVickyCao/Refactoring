package com.hades.example.java.refactoring.before.c9.c9_8_introduce_assertion;

class Employee {
    static final double NULL_EXPENSE = -1.0;
    private double _expenseLimit = NULL_EXPENSE;
    private Project _primaryProject;

    public double getExpenseLimit() {
        // 开支限制：任何员工要么参与某个项目，要么个人开支限额
        return _expenseLimit != NULL_EXPENSE ? _expenseLimit : _primaryProject.getMemberExpenseLimit();
    }

    public void setExpenseLimit(double expenseLimit) {
        _expenseLimit = expenseLimit;
    }
}
