package ch7;

public class Inheritance1 {
	public static void main(String[] args) {
		// 1.1 상속의 정의와 장점
		// 생성자와 초기화블럭 제외한 모든 멤버 상속 - 이름도 그대로!
		
		// extend인 이유 : 조상클래스를 확장한다는 의미로 해석 가능하기에
		// 접근제어자 private 이나 default는 상속되지 않는다기보다 상속은 받지만 
		// 자손클래스로부터 접근이 불가능하다는 것
		
		// 1.2 클래스간의 관계 - 상속관계
		// 조상클래스 변경 -> 자손클래스 변경
		// 역은 성립하지 않는다. 
		
		// 1.3 클래스간의 관계 - 포함관계
		// 상속이외의 방법 : 포함관계를 맺어주는 것.
		Circle c = new Circle();
		System.out.println(c.p.x);
		
		// 결정은 p8에 나와있음. is면 상속, has면 포함
		
		// 추가적인 내용
		String s = new String("abc");
		System.out.println(s);
		// 분명 참조변수가 나와야 하는데 문자열 값이 출력됨. 
		// 자동으로 toString()메서드가 호출되기 때문.
		// 모든 클래스의 조상인 Object 클래스에 있기에 어떤 종류의 객체든 가능
		
	}
}

class Point {
	int x;
	int y;
}

class Circle {
	Point p = new Point();
	int r;
}