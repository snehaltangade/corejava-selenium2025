package org.tw.snehal;

public class TestInstancevariable4 {
    // Instance Variable
    int a = 100;
    int b = 200;

    // Normal Method/Instance method
    public void m1() {
        // Instance Area
        System.out.println(a);
    }

    // static method
    public static void m2() {
        // Static Area/Context
        TestInstanceVariable4 obj = new TestInstanceVariable4();
        System.out.println(obj.b);
    }

    public static void main(String[] args) {
        // Static Area/Context
        TestInstanceVariable4 obj = new TestInstanceVariable4();
        // System.out.println(b);
        System.out.println(obj.b);
    }

}
