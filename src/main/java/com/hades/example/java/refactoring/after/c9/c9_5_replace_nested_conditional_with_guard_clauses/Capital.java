package com.hades.example.java.refactoring.after.c9.c9_5_replace_nested_conditional_with_guard_clauses;

public class Capital {
    double _capital = 5;
    double _intRate = 1.5;
    double _duration = 6.0;
    double _income = 1000;
    int ADJ_FACTOR = 10;


    // Step 1 ： 先条件反转，然后加入为卫语句
//    public double getAdjustedCapital() {
//        double result = 0.0;
//        if (!(_capital > 0.0)) {
//            return result;
//        }
//
//        if (!(_intRate > 0.0) || !(_duration > 0.0)) {
//            return result;
//        }
//
//        result = (_income / _duration) * ADJ_FACTOR;
//        return result;
//    }

//    public double getAdjustedCapital() {
//        double result = 0.0; // Step 3 ： 移除临时变量result
//        if (!(_capital > 0.0)) {
//            return result;
//        }
//
////        if (!(_intRate > 0.0) || !(_duration > 0.0)) { // Step 2 ： 去掉逻辑非
////            return result;
////        }
//
//        if (_intRate <= 0.0 || _duration <= 0.0) {
//            return result;
//        }
//
//        result = (_income / _duration) * ADJ_FACTOR;
//        return result;
//    }

    public double getAdjustedCapital() {
        if (!(_capital > 0.0)) {
            return 0.0;
        }

        if (_intRate <= 0.0 || _duration <= 0.0) {
            return 0.0;
        }
        return (_income / _duration) * ADJ_FACTOR;
    }
}