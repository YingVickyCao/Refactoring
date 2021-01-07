package com.hades.example.java.refactoring.before.c8._c8_13_replace_type_code_with_class;

class Person {

    // 没有运行时检验能力
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;

    private int _bloodGroup;

    public Person(int bloodGroup) {
        // 如何具有运行时检验能力？ 判断value in [0,3].同时重命名4个blood
        _bloodGroup = bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        _bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return _bloodGroup;
    }
}