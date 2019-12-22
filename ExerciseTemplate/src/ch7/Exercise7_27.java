package ch7;

public class Exercise7_27 {
    public static void main(String[] args) {
        // Here

        inner.method1();
    }
}

class Outer {
    int value=10;

    class Inner {
        int value=20;
        void method1() {
            int value=30;

            System.out.println("Here");
            System.out.println("Here");
            System.out.println("Here");
        }
    }
