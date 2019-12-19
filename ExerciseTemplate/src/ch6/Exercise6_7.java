package ch6;

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Here!! 인스턴스메서드 getDistance 작성
}