package ch6;

public class ObjLesson7 {
	public static void main(String[] args) {
		// 매개변수의 타입이나 개수가 다르면 같은 이름을 통해 메서드를 정의할 수 있다. 
		
		// 조건은 피피티에 나와 있음.
		// println 메서드 역시 10개가 정의됨. 
		
		// 리턴 타입만 다른 것은 오버로딩 성립하지 않음
		// 그저 이미 같은 메서드가 정의되었다는 메시지가 나타날 것
		
		// 메서드의 매개변수 개수가 고정적이었으나, 동적으로 지정 가능
		// PrintStream 클래스의 printf 메서드가 대표적인 예시
		// public PrintStream printf(String format, Object... args) { }
		// 가변인자가 가장 나중에 와야함, 타입...변수명 과 같은 형식으로 선언
		
	}
}
