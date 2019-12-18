package ch6;

public class ObjLesson3 {
	public static void main(String[] args) {
		// 메서드의 선언과 구현
		
				/*
				 * 반환타입 메서드이름 (타입 변수명, 타입 변수명, ...)
				 * { 
				 * 		// 메서드 호출 시 수행할 코드
				 * }
				 */
				
				// 반환값이 없을 경우에는 void를 사용해야 함.
				// 반환값이 있을 경우에는 무조건 return구문을 사용해야 함.
		
		// 같은 클래스 내의 메서드끼리는 참조변수 없어도 호출 가능
		// But static 메서드는 같은 클래스 내의 인스턴스 메서드 호출 불가
		
		// return 문은 모든 메서드에 포함되어야 하지만, void의 경우알아서 return구문을 추가해주기에 문제 X
		
		// 매개변수의 유효성 검사 필요!!
		// 절대 호출하는 쪽에서 알아서 적절한 값을 넘겨주리라는 생각 X
		// 0으로 나누면 제어해주지 않으면, 이를 수행하는 곳에서 프로그램이 비정상적으로 종료됨.
	}
}

class Mymath {
	long add(long a, long b) {
		long result = a+b;
		return result;
	// return a+b;
	}
	long subtract(long a, long b) { return a-b;}
	
	long multiply(long a, long b) { return a*b;}
	
	double divide(double a, double b) {return a/b;}
	// long 타입을 넣어도 됨, 자동형변환이 되기 때문.

}