package com.hades.example.java.refactoring.after._c6_1_extract_method._2_reassign_local_variable;

import com.hades.example.java.refactoring.before._c6_1_extract_method.Order;

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
        // TODO：totalAmount
        double totalAmount = 0.0;
        printBanner();

        for (Order order : orders) {
            totalAmount += order.getAmount();
        }

        printDetails(totalAmount);
    }

    private void printBanner() {
        System.out.println("****************");
        System.out.println("***** test *****");
        System.out.println("****************");
    }

    public void printDetails(double amount) {
        System.out.println("name:" + name);
        System.out.println("amount:" + amount);
    }
}