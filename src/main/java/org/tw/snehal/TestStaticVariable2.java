package org.tw.snehal;

public class TestStaticVariable2 {
    public static void main(String[] args) {

        TestStaticVariable1 obj = new TestStaticVariable1();
        System.out.println(obj.a);

        System.out.println(TestStaticVariable1.a);
    }

}
