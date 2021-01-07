package com.hades.example.java.refactoring.after._c8._c8_13_replace_type_code_with_class;

// 拥有运行时检验能力
public class BloodGroup {
    public static final BloodGroup O = new BloodGroup(0);
    public static final BloodGroup A = new BloodGroup(1);
    public static final BloodGroup B = new BloodGroup(2);
    public static final BloodGroup AB = new BloodGroup(3);
    private static final BloodGroup[] _values = {O, A, B, AB};

    private final int code;

    //    public BloodGroup(int code) {
//        this.code = code;
//    }
    private BloodGroup(int code) {
        this.code = code;
    }

//    public int getCode() {
//        return code;
//    }

    private int getCode() {
        return code;
    }

//    public static BloodGroup code(int arg) {
//        return _values[arg];
//    }

    private static BloodGroup code(int arg) {
        return _values[arg];
    }
}