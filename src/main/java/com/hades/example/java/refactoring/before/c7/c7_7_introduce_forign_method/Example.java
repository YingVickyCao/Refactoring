package com.hades.example.java.refactoring.before.c7.c7_7_introduce_forign_method;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    private void test() {
        Date previousEnd = new Date(2020, 11, 13);

        // 客户类：Example
        // SESSION:客户类使用这个功能很多次
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
        Date newStart2 = new Date(newStart.getYear(), newStart.getMonth(), newStart.getDate() + 1);
        Date newStart3 = new Date(newStart2.getYear(), newStart2.getMonth(), newStart2.getDate() + 1);
    }

    // 服务类：Date
    class Date {
        int year;
        int month;
        int date;

        public Date(int year, int month, int date) {
            this.year = year;
            this.month = month;
            this.date = date;
        }

        int getYear() {
            return year;
        }

        int getMonth() {
            return month;
        }

        int getDate() {
            return date;
        }
    }
}