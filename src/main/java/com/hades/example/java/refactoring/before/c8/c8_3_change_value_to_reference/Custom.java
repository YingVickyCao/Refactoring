package com.hades.example.java.refactoring.before.c8.c8_3_change_value_to_reference;

// 值对象：内容不可更改
public class Custom {
    private final String name;

    public Custom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
