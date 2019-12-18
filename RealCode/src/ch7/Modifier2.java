package ch7;

public class Modifier2 {
	public static void main(String[] args) {
		// 4.6 접근 제어자 
		// 사용하는 이유 p11 
		// public은 다른 패키지 안의 클래스를 import해서 사용가능
		// 그러나 default는 불가능
		
		// 멤버변수의 값을 읽는 메서드는 get으로
		// 멤버변수의 값을 변경하는 메서드는 set으로 시작하도록
		
		// 한 소스파일에 public class는 단 하나
		
		// 4.8 
		// 코드 해석해보자. 
		// Singleton s = new Singleton(); 에러 발생
		Singleton s1 = Singleton.getInstance();
		// 즉, 인스턴스 개수에 제한을 둔 것임
		
		
		
	}
}

final class Singleton { // final은 안붙여도 됨.
	// 애초에 상속해도 자손클래스의 인스턴스 생성시 조상클래스의 생성자를 호출해야 함.
	// 그러나 생성자 접근제어자가 private이므로 불가능
	// 그저 상속할 수 없음을 표시해둔 것
	
	private static Singleton s = new Singleton();
	private static int a=3;
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
}