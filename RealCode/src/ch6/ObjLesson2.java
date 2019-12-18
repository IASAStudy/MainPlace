package ch6;

public class ObjLesson2 {
	public static void main(String[] args) {
		// ch6-2
		System.out.println("Card.width = " + Card.width);
		// 인스턴스 생성 없이도 사용 가능
		
		// 3.3
		// 메서드
		
		// 장점 1 : 높은 재사용성
		// 장점 2 : 중복된 코드의 제거
		// 장점 3 : 구조 단순화 
		
		// main메서드는 프로그램의 전체 흐름이 한눈에 들어올 정도로 단순하게 구조화하는 것이 좋다. 
		
		
	}
}

class Variables {
	int iv; // 인스턴스 변수 
	// 참조변수명.인스턴스변수명 으로 접근
	
	static int cv; // 클래스 변수 -> 모든 인스턴스들이 공유하는 변수
	// 클래스명.클래스변수명 으로 접근
	
	void method() {
		int iv = 0; // 메서드 변수
		// 메서드 종료시 소멸
	}
}

class Card {
	String kind; // 무늬
	int number; // 숫자
	
	static int width = 100; //폭
	static int height = 250; //높이
	
	
}

