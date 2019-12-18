package ch6;

public class ObjLesson4 {
	public static void main(String[] args) {
		// JVM의 구조를 이해하자.
		System.out.println("main메서드가 실행되었음");
		
		firstMethod();
		
		System.out.println("main메서드가 종료되었음");
		
	}
	
	static void firstMethod() {
		System.out.println("firstMethod가 실행되었음");
		secondMethod();
		System.out.println("firstMethod가 종료되었음");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod가 실행되었음");
		System.out.println("secondMethod가 종료되었음");
	}
	
	// 그치 static은 인스턴스 생성 없이도 메모리에 올라오니 인스턴스 메서드는 호출할 수 없지
}
