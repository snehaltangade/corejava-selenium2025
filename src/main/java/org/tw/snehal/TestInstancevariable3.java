package org.tw.snehal;

public class TestInstancevariable3 {
    int a;
    int b;

    public void addition1() {
        a = 100;
        b = 200;
        int c = a + b;
        System.out.println("Addition 1 : " +c);
    }

    public void addition2() {
        a = 300;
        b = 400;
        int c = a + b;
        System.out.println("Addition 2 : " +c);
    }

    public void addition3() {
        // Local Variable
        int a = 10;
        b = 20;
        int c = a + b;
        System.out.println("Addition 3 : " +c); // 10 + 20 = 30
    }

    public void addition4() {
        // Local variable
        int a = 10;
        int c = a + b;
        System.out.println("Addition 4 : " +c);
    }

    public static void main(String[] args) {
        TestInstanceVariable3 obj = new TestInstanceVariable3();
        System.out.println(obj.a); // 0
        System.out.println(obj.b); // 0

        obj.addition1(); // 300
        obj.addition2(); // 700
        obj.addition3(); //
        obj.addition4(); //  30

        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
