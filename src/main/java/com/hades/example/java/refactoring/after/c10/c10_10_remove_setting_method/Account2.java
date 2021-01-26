package com.hades.example.java.refactoring.after.c10.c10_10_remove_setting_method;

public class Account2 {
    private String _id;

    public Account2(String id) {
        initId(id);
    }

    public void initId(String id) {
        _id = "ZZ" + id;
    }
}
