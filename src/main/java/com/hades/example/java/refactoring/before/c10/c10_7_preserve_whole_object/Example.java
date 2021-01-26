package com.hades.example.java.refactoring.before.c10.c10_7_preserve_whole_object;

public class Example {
    public static void main(String[] args) {
        HeatingPlan heatingPlan = new HeatingPlan();
        Room room = new Room();
        room.update();
        boolean flag = room.withPlan(heatingPlan);
        System.out.println(flag);
    }
}
