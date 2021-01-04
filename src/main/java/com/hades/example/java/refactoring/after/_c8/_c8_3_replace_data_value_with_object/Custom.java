package com.hades.example.java.refactoring.after._c8._c8_3_replace_data_value_with_object;

import java.util.HashMap;
import java.util.Map;

// 引用对象
public class Custom {
    private final String name;
    private static Map<String, Custom> instances = new HashMap<>();

//    public static Custom create(String name) {
//        return new Custom(name);
//    }

//    public static Custom create(String name) {
//        return instances.get(name);
//    }

    public static Custom getNamed(String name) {
        return instances.get(name);
    }

    // 请求时创建新的Custom对象？还是预先创建好？后者
    public static void loadCustomers() {
        new Custom("A").store();
        new Custom("B").store();
        new Custom("C").store();
    }

    private void store() {
        instances.put(this.getName(), this);
    }

    private Custom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}