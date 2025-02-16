package org.tw.snehal;

public class TestStaticVariable {
    static int a = 100;

    public void m1() {
        // static int c = 200; Not allowed
        System.out.println(TestStaticVariable1.a); // By using class name
    }

    public static void main(String[] args) {
        // static int b = 300; Not allowed

        System.out.println(a); // 1. Direct access

        System.out.println(TestStaticVariable1.a); // 2. By using class name

        TestStaticVariable1 obj = new TestStaticVariable1();
        System.out.println(a); // 3. By using object creation
    }
}
