package com.hades.example.java.refactoring.before.c9.c9_4_remove_control_flag;

public class Example {
    // Example 1: 以break 取代简单的控制标记
    // 检查是否包含可疑人员
    void checkSecurity(String[] people) {
        // found 做了1件事情：控制标记
        boolean found = false;
        for (String person : people) {
            if (!found) {
                if (person.equals("Tom")) {
                    sendAlert();
                    found = true;
                }

                if (person.equals("Jerry")) {
                    sendAlert();
                    found = true;
                }
            }
        }
    }

    private void sendAlert() {
    }

    // Example 2: 以return 返回控制标记
    // 检查是否包含可疑人员
    void checkSecurity2(String[] people) {
        // found 做了2件事情：控制标记，运算结果
        String found = "";
        for (String person : people) {
            if (found.equals("")) {
                if (person.equals("Tom")) {
                    sendAlert();
                    found = person;
                }

                if (person.equals("Jerry")) {
                    sendAlert();
                    found = person;
                }
            }
        }
    }

    void someLaterCode(String found) {
        System.out.println(found);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.checkSecurity(new String[]{"People 1", "Tom", "People 2"});
    }
}
