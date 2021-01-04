package com.hades.example.java.refactoring.before._c8._c8_3_replace_data_value_with_object;

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
