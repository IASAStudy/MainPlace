package ch7;

public class Modifier1 {
	public static void main(String[] args) {
		// 4.1 제어자란
		// 클래스, 변수, 메서드의 선언부에 함께 사용되어 부가적의미를 가짐
		// 접근제어자 & 그 외
		
		// 4.2 static
		// 다 한 내용 - 편리하고 속도도 더빠름!
		
		// 4.3 final
		// 상수로 만든다는 거 배웠었음. 
		// 클래스에 붙으면 상속할 수 없는 클래스가 됨.
		// !!!! 피피티에는 틀린 점이 하나 있다. !!!!
		// 인스턴스 변수는 명시적 초기화를 하지 않은 경우, 생성자에서 초기화 가능
		
		// 4.5 abstract
		// 미완성의
		// 추상 클래스는 메서드의 선언부만 작성되어있는 추상 메서드가 들어있음. 
		// 따라서 인스턴스 생성 불가능 
		// 장점 : 원하는 메서드만 오버라이딩해도 됨. 
		
	}
}
final class FinalTest {
	final int MAX_SIZE = 10;
	
	final int getMaxSize() {
		final int LV = MAX_SIZE;
		return MAX_SIZE;
	}
}
/*
class Child extends FinalTest { // 상속불가능
	void getMaxSize() {}; // 오버라이딩도 불가능
}
*/