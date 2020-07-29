package com.hades.example.java.refactoring.before._c6._c6_6_split_temporary_variable;

public class Example {
    private int _primaryForce = 5;
    private double _mass = 5D;
    private int _delay = 10;
    private int _secondaryForce = 50;

    // 根据牛顿第二定律，计算布丁运动的距离
    double getDistanceTravelled(int time) {
        double result;
        double acc = _primaryForce / _mass;  // SESSION: 1
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * acc * primaryTime * primaryTime;// SESSION: 1
        int secondaryTime = time - _delay;
        if (secondaryTime > 0) {
            double primaryVel = acc * _delay;
            acc = (_primaryForce + _secondaryForce) / _mass;// SESSION: 2
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;// SESSION: 2
        }
        return result;
    }
}
