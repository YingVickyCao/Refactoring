package com.hades.example.java.refactoring.before.c6.c6_1_extract_method._3_use_local_variable;

import com.hades.example.java.refactoring.before.c6.c6_1_extract_method.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Example() {
        orders.add(new Order(1));
        orders.add(new Order(3));
    }

    public void printOwing() {
        // SESSION:totalAmount
        double totalAmount = 0.0;
        Iterator<Order> it = orders.iterator();

        printBanner();

        while (it.hasNext()) {
            // SESSION：totalAmount
            totalAmount += it.next().getAmount();
        }

        printDetails(totalAmount);
    }

    public void printOwing2(double previousAmount) {
        // SESSION：totalAmount
        double totalAmount = previousAmount * 1.2;
        Iterator<Order> it = orders.iterator();

        printBanner();

        while (it.hasNext()) {
            // SESSION：totalAmount
            totalAmount += it.next().getAmount();
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