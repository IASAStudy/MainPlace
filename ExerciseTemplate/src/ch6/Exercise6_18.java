package ch6;

public class Exercise6_18 {
    public static void main(String[] args) {
        // 어디에서, 왜 에러가 발생할까요?
        // A. Here!!
    }
}

class MemberCall {
    int iv=20;
    static int cv=20;

    int iv2 = cv;
    static int cv2 = iv;    // line A

    static void staticMethod1() {
        System.out.println(cv);
        System.out.println(iv);    // line B
    }

    void instanceMethod() {
        System.out.println(cv);
        System.out.println(iv);    // line C
    }

    static void staticMethod2() {
        staticMethod1();
        instanceMethod1();    // line D
    }

    static instanceMethod2() {
        staticMethod1();
        instanceMethod1();    // line E
    }
}
