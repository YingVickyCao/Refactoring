package com.hades.example.java.refactoring.before.c9.c9_5_replace_nested_conditional_with_guard_clauses;


/**
 * 薪资系统
 */
public class PaymentSystem {
    boolean _isDead = false;
    boolean _isSeparated = true;
    boolean _isRetired = false;

    /** Case 1: 卫语句
     * 以特殊规则处理死亡员工、驻外员工、退休员工的薪资。这些情况虽然不常有，但是偶尔会出现
     */
    double getPayAmount() {
        // 非正常情况的检查掩盖了正常情况的检查，应该使用为卫语句取代这些检查，以提高程序清晰度
        double result;
        if (_isDead) {
            // 如果函数剩下部分不再感兴趣，应该立刻退出
            result = deadAmount();
        } else {
            if (_isSeparated) {
                result = separatedAmount();
            } else {
                if (_isRetired) {
                    result = retiredAmount();
                } else {
                    result = normalPayAmount();
                }
            }
        }
        return result;
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
