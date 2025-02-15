package org.tw.snehal;

public class TestLocalVariables {
    public void m1(int a) {
        // Local Variable
        int rollNumber = 100;
        System.out.println("I am inside m1 method");
        System.out.println(a);
        System.out.println(rollNumber);
    }

    public static void main(String[] args) {

        // Local Variable

        int age1 = 20;
        int age2 = 30;

        boolean b1 = true;
        boolean b2 = false;

        // Array
        int[] ages = {10, 20, 30};
        System.out.println(age1);
        System.out.println(age2);

        int age;
        // System.out.println(age);

        String name = "Shriniwas";
        System.out.println(name);

        // String public = "Rohit"; We can not provide the keywords as a variable name
        // System.out.println(public);

        // String 123name = "Shriniwas"; We can not declare a variable starts with number

        // String #name // Not allowed
        // String @name // Not allowed

        String student_name = "Shri";
        System.out.println(student_name);

        int a = 100;
        int b = 200;
        int c = a + b;
        System.out.println("Addition of A and B :" +c);

        System.out.println("----------------------------");

        // Object Creation
        TestInstanceVariable1 obj = new TestInstanceVariable1();
        System.out.println(obj.names); // Shri
        System.out.println(obj.age); // 100
    }
}
