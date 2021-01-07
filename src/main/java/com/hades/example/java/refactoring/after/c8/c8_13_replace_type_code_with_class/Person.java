package com.hades.example.java.refactoring.after.c8.c8_13_replace_type_code_with_class;

class Person {
//    public static final int O = BloodGroup.O.getCode();
//    public static final int A = BloodGroup.A.getCode();
//    public static final int B = BloodGroup.B.getCode();
//    public static final int AB = BloodGroup.AB.getCode();

    private BloodGroup _bloodGroup;

//    public Person(int bloodGroup) {
//        _bloodGroup = BloodGroup.code(bloodGroup);
//    }

    public Person(BloodGroup bloodGroup) {
        _bloodGroup = bloodGroup;
    }

//    public void setBloodGroup(int bloodGroup) {
//        _bloodGroup = BloodGroup.code(bloodGroup);
//    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        _bloodGroup = bloodGroup;
    }

//    public int getBloodGroup() {
//        return _bloodGroup.getCode();
//    }

//    public int getBloodGroupCode() {
//        return _bloodGroup.getCode();
//    }

    public BloodGroup getBloodGroupCode() {
        return _bloodGroup;
    }
}