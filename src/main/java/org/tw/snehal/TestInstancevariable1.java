package org.tw.snehal;

public class TestInstancevariable1 {
    // Instance Variable
    int age = 100;
    String names = "Shri";
    String studentName;

    public void m1() {
        System.out.println(age); // 100
        System.out.println(names); // Shri
    }

    public void m2() {
        System.out.println(studentName); // By default String value is 'null' if we don't assign any value to it
    }

    public static void main(String[] args) {
        // Object Creation
        TestInstanceVariable1 obj = new TestInstanceVariable1();
        obj.m1();
        System.out.println("---------------------");
        obj.m2();
    }
}
