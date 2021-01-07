package com.hades.example.java.refactoring.after.c6.c6_8_replace_method_with_method_object;

public class Gama {
    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gama(Account _account, int inputVal, int quantity, int yearToDate) {
        this._account = _account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    // 好处：轻松地对 compute () 函数采取 Extract Method(110),不用担心参数传递地问题
    int compute() {
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
//        if ((yearToDate - importantValue1) > 100)
//            importantValue2 -= 20;
        importantThing();
        int importantValue3 = importantValue2 * 7;
        // and so on...
        return importantValue3 - 2 * importantValue1;
    }

    void importantThing() {
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
    }
}