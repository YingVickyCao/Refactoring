package com.hades.example.java.refactoring.after.c9.c9_3_consolidate_duplicate_conditional_fragments;

public class Example {
    // Example 1: 以break 取代简单的控制标记
    // 检查是否包含可疑人员
    void checkSecurity(String[] people) {
        for (String person : people) {
            if (person.equals("Tom")) {
                sendAlert();
                break;
            }

            if (person.equals("Jerry")) {
                sendAlert();
                break;
            }
        }
    }

    private void sendAlert() {
    }

    // Example 2: 以return 返回控制标记
    // 检查是否包含可疑人员
    void checkSecurity2(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    String foundMiscreant(String[] people) {
        for (String person : people) {
            if (person.equals("Tom")) {
                sendAlert();
                return person;
            }

            if (person.equals("Jerry")) {
                sendAlert();
                return person;
            }
        }
        return "";
    }

    void someLaterCode(String found) {
        System.out.println(found);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.checkSecurity(new String[]{"People 1", "Tom", "People 2"});
    }
}
