package com.hades.example.java.refactoring.before.c8._c8_2_replace_data_value_with_object;

import java.util.List;

public class Example {
    public static void main(String[] args) {
    }

    int numberOfOrdersFor(List<Order> orders, String customer) {
        int result = 0;
        for (Order each : orders) {
            if (each.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
