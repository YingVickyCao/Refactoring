package com.hades.example.java.refactoring.before._c7._c7_8_introduce_local_extension;

import com.hades.example.java.refactoring.after._c7._c7_8_introduce_local_extension.Example2;

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

    private Date nextDay(final Date previousEnd) {
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

        private boolean after(Date arg) {
            return true;
        }
    }
}
