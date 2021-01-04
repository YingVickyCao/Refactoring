package com.hades.example.java.refactoring.before._c8._c8_3_replace_data_value_with_object;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Order order =new Order("A");
        Order order2 =new Order("A");

        List<Order> list= new ArrayList<>();
        list.add(order);
        list.add(order2);
        int num = numberOfOrdersFor(list,"A");
        System.out.println(num);    // 2
    }

    static int numberOfOrdersFor(List<Order> orders, String customer) {
        int result = 0;
        for (Order each : orders) {
            if (each.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
