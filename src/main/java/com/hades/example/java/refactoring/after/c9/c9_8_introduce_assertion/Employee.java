package com.hades.example.java.refactoring.after.c9.c9_8_introduce_assertion;

import org.junit.Assert;

class Employee {
    static final double NULL_EXPENSE = -1.0;
    private double _expenseLimit = NULL_EXPENSE;
    private Project _primaryProject;

    public double getExpenseLimit() {
        Assert.assertTrue(_expenseLimit != NULL_EXPENSE || null != _primaryProject);

        return _expenseLimit != NULL_EXPENSE ? _expenseLimit : _primaryProject.getMemberExpenseLimit();
    }

    public void setExpenseLimit(double expenseLimit) {
        _expenseLimit = expenseLimit;
    }
}