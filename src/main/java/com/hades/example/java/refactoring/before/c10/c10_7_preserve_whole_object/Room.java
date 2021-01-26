package com.hades.example.java.refactoring.before.c10.c10_7_preserve_whole_object;

// Room负责记录房间中一天中的最高温度和最低温度，然后把这个对象与实际的温度范围与预定规定的温度控制计划比较
public class Room {
    TempRange _tempRange = new TempRange();

    void update() {
        _tempRange.low = 2;
        _tempRange.high = 10;
    }

    boolean withPlan(HeatingPlan plan) {
        int low = _tempRange.getLow();
        int high = _tempRange.getHigh();
        return plan.withRange(low, high);
    }
}