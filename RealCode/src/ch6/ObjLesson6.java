package ch6;

public class ObjLesson6 {
	public static void main(String[] args) {
		// Recursive Call
		
		int result = factorial(4);
		System.out.println(result);
	}
	
	static int factorial(int n) {
		int result = 0;
		
		if( n ==1 ) {
			result = 1;
		} else {
			result = n*factorial(n-1);
		}
		
		return result;
	}
	
	// static 메서드이므로 인스턴스 생성없이 사용가능
	// main 메서드와 같은 클래스 내에 있으므로 클래스명 역시 생략 가능
	
	
	// 인스턴스 메서드
	// 인스턴스 생성 후, 사용 가능 -> 참조변수명.메서드이름()
	// 메서드 내에서 인스턴스 변수 사용 가능 참조변수도 당연히 가능
	
	// 클래스 메서드
	// static 붙여야 하고, 클래스이름.메서드이름() 으로 호출
	// 인스턴스 변수 사용 불가능
	// 즉, 인스턴스 변수를 사용하지 않는다면 클래스메서드로 정의하자.
	
	// 알아두면 좋아요!!
	
	// MemberCall c = new MemberCall();
	// int result = c.instanceMethod1()
	
	// VS
	
	// int result = new MemberCall().instanceMethod();
	
	// 이 차이를 이해했다면 어느정도 이해 완료한 것임!!
	
 }
