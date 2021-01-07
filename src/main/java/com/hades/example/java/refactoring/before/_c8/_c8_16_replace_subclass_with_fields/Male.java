package com.hades.example.java.refactoring.before._c8._c8_16_replace_subclass_with_fields;

class Male extends Person {
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}
