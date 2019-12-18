package ch6;

public class ObjLesson8 {
	public static void main(String[] args) {
		// ch6-3
		
		// 생성자 -> 인스턴스 초기화 메서드 
		// 모든 클래스에는 하나 이상의 생성자 필요
		// 오해 No! : 생성자가 인스턴스를 만든 것이 아님.
		
		// 생성자는 언제 작용?
		
		// ppt 8쪽은 기본 생성자가 없기에 에러 발생
		// p9. 역시 매개변수를 받아서 원하는 값으로 초기화한 인스턴스 생성 가능
		// 모다 간결하고 직관적으로 초기화 가능
		
		// 생성자에서 다른 생성자 호출 - this() & this
		// 조건 두가지 필요 
		
		// this : 인스턴스 자신을 가리키는 참조변수 
		// 모든 인스턴스 메서드(쌩성자 포함)에 지역변수로 숨겨진 채로 존재
		
	}
}

class Car {
	String color;
	String gearType;
	int door; 
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	} // this를 안쓰면 무의미해짐. 매개변수와 인스턴스변수가 구분이 안되기에. 
	// 매개변수를 다르게 하면 괜춘
	// 역시 this로는 인스턴스변수에만 접근 가능 이유는 알지?
	
	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	} // 이렇게 생성자를 통해 인스턴스를 복사할 수도 있다.
	
	
}
