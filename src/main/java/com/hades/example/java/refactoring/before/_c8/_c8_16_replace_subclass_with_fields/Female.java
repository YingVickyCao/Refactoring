package com.hades.example.java.refactoring.before._c8._c8_16_replace_subclass_with_fields;

class Female extends Person {
    @Override
    char getCode() {
        return 'F';
    }

    @Override
    boolean isMale() {
        return false;
    }
}