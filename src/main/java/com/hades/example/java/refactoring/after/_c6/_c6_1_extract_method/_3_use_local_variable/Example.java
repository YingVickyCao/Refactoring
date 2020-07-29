package com.hades.example.java.refactoring.after._c6._c6_1_extract_method._3_use_local_variable;

import com.hades.example.java.refactoring.before._c6._c6_1_extract_method.Order;

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
        printBanner();
        /**
         * Iterator<Order> it :只在被提炼代码段中使用。-> 格该临时变量的声明移动到被提炼代码中
         */
        double totalAmount = getTotalAmount();
        printDetails(totalAmount);
    }

    public void printOwing2(double previousAmount) {
        printBanner();
        double totalAmount = getTotalAmount2(previousAmount);
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

    public double getTotalAmount() {
        double totalAmount = 0.0;
        Iterator<Order> it = orders.iterator();

        while (it.hasNext()) {
            totalAmount += it.next().getAmount();
        }
        return totalAmount;
    }

    public double getTotalAmount2(double previousAmount) {
        double totalAmount = previousAmount * 1.2;
        Iterator<Order> it = orders.iterator();

        while (it.hasNext()) {
            totalAmount += it.next().getAmount();
        }
        return totalAmount;
    }
}