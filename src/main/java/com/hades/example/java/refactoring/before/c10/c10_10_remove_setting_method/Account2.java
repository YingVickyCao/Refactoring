package com.hades.example.java.refactoring.before.c10.c10_10_remove_setting_method;

public class Account2 {
    private String _id;

    public Account2(String id) {
        setId(id);
    }

    public void setId(String id) {
        _id = "ZZ" + id;
    }
}
