package com.hades.example.java.refactoring.before.c10.c10_6_replace_parameter_with_explicit_methods;

public class MyView {
    int _height;
    int _width;

    void setValue(String name, int value) {
        if (name.equals("height")) {
            _height = value;
            return;
        }
        if (name.equals("width")) {
            _width = value;
            return;
        }
    }
}