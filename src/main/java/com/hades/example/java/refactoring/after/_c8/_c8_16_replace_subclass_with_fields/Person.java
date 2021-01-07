package com.hades.example.java.refactoring.after._c8._c8_16_replace_subclass_with_fields;

class Person {
    private final boolean _isMale;
    private final char _code;
    
    private Person(boolean isMale, char code) {
        _isMale = isMale;
        _code = code;
    }

    // 工厂函数
    static Person createMale() {
        return new Person(true, 'M');
    }

    static Person createFemale() {
        return new Person(false, 'F');
    }

    boolean isMale() {
        return _isMale;
    }

    char getCode() {
        return _code;
    }
}