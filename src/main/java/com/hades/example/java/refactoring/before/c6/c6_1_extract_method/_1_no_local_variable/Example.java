package com.hades.example.java.refactoring.before.c6.c6_1_extract_method._1_no_local_variable;

import com.hades.example.java.refactoring.before.c6.c6_1_extract_method.Order;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Example() {
        orders.add(new Order(1));
        orders.add(new Order(3));
    }

    public void printOwing() {
        double totalAmount = 0.0;
        // SESSION:：println
        System.out.println("****************");
        System.out.println("***** test *****");
        System.out.println("****************");

        for (Order order:orders){
            totalAmount += order.getAmount();
        }

        System.out.println("name:" + name);
        System.out.println("amount:" + totalAmount);
    }
}
