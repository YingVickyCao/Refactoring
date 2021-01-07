package com.hades.example.java.refactoring.after.c7.c7_7_introduce_forign_method;

public class Example {
    public static void main(String[] args) {
        new Example().test();
    }

    private void test() {
        Date previousEnd = new Date(2020, 11, 13);

        // 客户类：Example
        Date newStart = nextDay(previousEnd);
        Date newStart2 = nextDay(newStart);
        Date newStart3 = nextDay(newStart2);
    }

    private Date nextDay(final Date previousEnd){
        // TODO: foreign method, should on date
        return new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
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