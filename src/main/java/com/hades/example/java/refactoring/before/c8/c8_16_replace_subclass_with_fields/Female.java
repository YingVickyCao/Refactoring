package com.hades.example.java.refactoring.before.c8.c8_16_replace_subclass_with_fields;

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