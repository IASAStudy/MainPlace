package ch7;

public class Inheritance3 {
	public static void main(String[] args) {
		// 2.5 super()
		// 조상의 생성자로, 자손 인스턴스 생성 시
		// 조상 멤버들도 초기화되어야 하기에 조상생성자 호출 필요 
		// 자동으로 추가해줌. 그러나 주의가 필요함 아래 예제를 보자.
		Child2 c = new Child2();
		c.method();
		
		// 아무튼 조상 클래스의 멤버변수는 조상의 생성자에 의해 초기화되도록 해야 함. 
	}
}

class Point1 {
	int x;
	int y;
	
	Point1(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :"+ x + ", y :" + y;
	}
}

class Point3D extends Point1 {
	int z;
	
	Point3D(int x, int y, int z) { 
		super(x,y); // 이거를 꼭 넣어줘야 함. Point에 기본 생성자가 없음.
		// 안넣어주면 super()을 생성하기에 에러
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x :"+ x + ", y :" + y + ", z :" +z;
	}
}

class Parent {
	int x=10;
}

class Child1 extends Parent {
	int x=20;

}

class Child2 extends Child1 {
	int x = 30;
	void method() {
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
