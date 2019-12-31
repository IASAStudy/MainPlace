
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
    static int cv2 = 30;    // static 변수는 instance 변수 못 씀

    static void staticMethod1() {
        System.out.println(cv);
        System.out.println(20);    // static 메소드는 instance 변수 못 쓴다
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);    // line C
    }

    static void staticMethod2() {
        staticMethod1();
        //instanceMethod1();    정적 메소드는 인스턴스 메소드 못 씀
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();    // line E
    }
}

