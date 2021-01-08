package com.hades.example.java.refactoring.after.c9.c9_5_replace_nested_conditional_with_guard_clauses;


/**
 * 薪资系统
 */
public class PaymentSystem {
    boolean _isDead = false;
    boolean _isSeparated = true;
    boolean _isRetired = false;

    /**
     * Case 1: 卫语句
     * 以特殊规则处理死亡员工、驻外员工、退休员工的薪资。这些情况虽然不常有，但是偶尔会出现
     */
    double getPayAmount() {
        if (_isDead) {
            return deadAmount();
        }

        if (_isSeparated) {
            return separatedAmount();
        }

        if (_isRetired) {
            return retiredAmount();
        }
        return normalPayAmount();
    }

    double deadAmount() {
        return 1000;
    }

    double separatedAmount() {
        return 100;
    }

    double retiredAmount() {
        return 50;
    }

    double normalPayAmount() {
        return 1000;
    }
}
