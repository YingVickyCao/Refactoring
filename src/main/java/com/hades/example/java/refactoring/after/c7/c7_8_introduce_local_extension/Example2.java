package com.hades.example.java.refactoring.after.c7.c7_8_introduce_local_extension;

public class Example2 {

    public static void main(String[] args) {
        new Example2().test();
    }

    private void test() {
        DateWrapper dateWrapper = new DateWrapper(new Date(2020, 11, 13));

        Date newStart = dateWrapper.nextDay();
        Date newStart2 = dateWrapper.nextDay();
        Date newStart3 = dateWrapper.nextDay();

        dateWrapper.after(new Date(2020, 11, 13));
        dateWrapper.after(dateWrapper);
    }

    // 包装类
    class DateWrapper {
        Date _original;

        public DateWrapper(Date original) {
            _original = original;
        }

        int getYear() {
            return _original.getYear();
        }

        int getMonth() {
            return _original.getMonth();
        }

        int getDate() {
            return _original.getDate();
        }

        private Date nextDay() {
            return new Date(getYear(), getMonth(), getDate() + 1);
        }

        // SESSION: Depressed:一般在扩展类中，不覆写原始函数，只会添加新函数
        private boolean after(Date arg) {
            // Do something
            return _original.after(arg);
        }

        // SESSION: Recommended
        private boolean afterDate(Date arg) {
            // Do something
            return _original.after(arg);
        }

        private boolean after(DateWrapper arg) {
            return _original.after(arg.getOriginal());
        }

        public Date getOriginal() {
            return _original;
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
