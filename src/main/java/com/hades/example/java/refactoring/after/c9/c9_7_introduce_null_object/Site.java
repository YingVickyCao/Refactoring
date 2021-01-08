package com.hades.example.java.refactoring.after.c9.c9_7_introduce_null_object;

class Site {
    Customer _customer;

    public Customer getCustomer() {
        return null == _customer ? Customer.createNull() : _customer;
    }
}