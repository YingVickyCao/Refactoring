package com.hades.example.java.refactoring.after._c8._c8_4_change_reference_to_value;

import java.util.Objects;

// 货币种类
public class Currency {
    private String code;
    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(code, currency.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}