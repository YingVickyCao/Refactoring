package com.hades.example.java.refactoring.after.c7.c7_8_introduce_local_extension;

public class Example {

    public static void main(String[] args) {
        new Example().test();
    }

    private void test() {
        DateSub dateSub = new DateSub(2020, 11, 13);

        Date newStart = dateSub.nextDay();
        Date newStart2 = dateSub.nextDay();
        Date newStart3 = dateSub.nextDay();

        dateSub.after(new DateSub(2020, 11, 13));
        dateSub.after(new Date(2020, 11, 13));
    }

    private Date nextDay(final Date previousEnd) {
        return new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
    }

    // 子类
    class DateSub extends Date {
        public DateSub(int year, int month, int date) {
            super(year, month, date);
        }

        private Date nextDay() {
            return new Date(getYear(), getMonth(), getDate() + 1);
        }

        // SESSION: Depressed:一般在扩展类中，不覆写原始函数，只会添加新函数
        private boolean after(Date arg) {
            // Do something
            return super.after(arg);
        }

        // SESSION: Recommended
        private boolean afterDate(Date arg) {
            // Do something
            return super.after(arg);
        }
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
