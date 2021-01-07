package com.hades.example.java.refactoring.after.c1.movie.v6;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name; // 姓名
    private Vector<Rental> _rentals = new Vector<>(); // 租借记

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); // 取得一笔租借记。
            // show figures for this rental（显示此笔租借记录）
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge(each) + "\n";
        }

        // add footer lines（结尾打印）
        result += "Amount owed is " + geTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public double geTotalCharge() {
        double totalCharge = 0; // 总消费金。
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); // 取得一笔租借记。
            totalCharge += each.getCharge(each);
        }
        return totalCharge;
    }

    public int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0; // 常客积点
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); // 取得一笔租借记。
            frequentRenterPoints = each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
