package ch7;

public class Polymorphism2 {
	public static void main(String[] args) {
		// 5.3 instanceof
		// instanceof연산자 : 이항연산자
		// 참조변수가 참조하는 인스턴스 타입이 이거입니까?
		
		FireEngine fe = new FireEngine();
		if(fe instanceof FireEngine) {
			System.out.println("This is FireEngine instance");
			
		}
		
		// TRUE면, 참조변수가 그 타입으로 형변환이 가능하다는 것!
		// 조상클래스의 멤버들을 전부 받기에 TRUE를 반환함. 
		
		// 5.4 
		// 메서드는 실제 인스턴스의 메서드가 호출(오버라이딩시)
		// 변수는 참조변수타입 따라감 (중복정의 시)
		
		// 5.5
		// 매개변수의 다형성 쓰임새
		// 매번 다른 buy함수를 만들어줘야 한다. 오버로딩 필요
		// PrintStream클래스의 print(Object o)메서드에서
		// Object는 모든 클래스의 조상이기에 한번에 싹 다 가능
		
		// 5.6
		// 조상타입의 참조변수 배열을 만들면 다 들여올 수 있음
		// 그러나 길이를 확정지을 수 없다는 단점!!
		// 이는 Vector클래스로 해결 가능 - 동적으로 크기가 관리되는 객체 배열
		
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr");
	}
	
	void stop() {
		System.out.println("Stop!!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("Siren!!!");
	}
}