package com.hades.example.java.refactoring.before.c8.c8_7_change_unidirectional_association_to_bidirectional;


public class Order {
    Customer _custom;

    public void setCustom(Customer custom) {
        _custom = custom;
    }

    public Customer getCustom() {
        return _custom;
    }
}
