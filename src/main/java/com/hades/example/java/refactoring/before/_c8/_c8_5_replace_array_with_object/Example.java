package com.hades.example.java.refactoring.before._c8._c8_5_replace_array_with_object;

public class Example {
    public static void main(String[] args) {

        // 一支球队
        String[] row = new String[3];
        row[0] = "Green tree";  // 名称
        row[1] = "15";  // 获胜场次
        row[2] = "2";  // 失利场次
        System.out.println(row[0]);
        System.out.println(row[1]);
        System.out.println(row[2]);
    }
}
