package ch6;

public class ObjLesson9 {
	public static void main(String[] args) {
		// 6.1 변수의 초기화
		
		// 인스턴스나 클래스변수는 알아서 초기화되지만, 
		// 지역변수는 반드시 초기화해줘야 함!!
		
		// 6.2 명시적 초기화 - 우리가 아는 거
		// 6.3 초기화 블럭
		// 조건, 반복 등 다 사용 가능
		// 왜 사용하냐? 모든 생성자에서 공통으로 수행왜야 하는 코드를 넣을 때
		// 객체지향의 목표는 재사용성 높이고, 중복을 제거하는 것이기에.
		
		System.out.println("BlockTest b1 = new BlockTest();");
		BlockTest b1 = new BlockTest();
		
		System.out.println("BlockTest b2 = new BlockTest();");
		BlockTest b2 = new BlockTest();
		
		// 아마 클래스가 사용됐는지 판단을 하고 넘어가는 듯. 
		// 일단 생성자 전에 생성되는 것은 맞다
		
		// 정리 : 초기화 순서
		// 클래스 : 명시적 -> 초기화 블럭
		// 인스턴스 : 명시적 -> 초기화 블럭 -> 생성자
		
		// 6.4 멤버변수의 초기화 시기와 순서 -> 피피티보고 설명
		
	}
}

class BlockTest{
	static {
		System.out.println("Static { }");
	}
	
	{ 
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
}


