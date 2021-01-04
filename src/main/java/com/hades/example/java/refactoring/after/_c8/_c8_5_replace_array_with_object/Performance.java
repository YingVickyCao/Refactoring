package com.hades.example.java.refactoring.after._c8._c8_5_replace_array_with_object;

// 一支球队
public class Performance {
    String name; // 名称
    int wins;   // 获胜场次
    int fail;   // 失利场次

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getFail() {
        return fail;
    }

    public void setFail(int fail) {
        this.fail = fail;
    }
}
