package ch7;

public class Inheritance2 {
	public static void main(String[] args) {
		// 1.4 단일상속(Single Inheritance)
		// Java는 단일상속만을 허용 
		
		// Why?
		// 서로 다른 클래스로부터 상속받은 멤버간의 이름이 같은 경우 구별할 수 없기에
		// 클래스 간의 관계가 굉장히 복잡해짐
		
		// 1.5 Object 클래스 
		// 조상이 없는 클래스는 자동으로 Object클래스 상속 
		// toString()과 equals(Object obj)의 메서드가 사용가능했던 이유임.
		
		// 2.1 오버라이딩이란? 
		// 상속받은 메서드의 내용을 변경하는 것.
		
		// Why? 같은 기능인데 확장되었다고 메서드의 이름이 달라지는 것은 비효율적인
		// 사용자도 같은 이름으로 실행되길 기대할 것임. 
		
		// 2.2 조건
		// 접근제어자와 예외이외의 선언부가 같아야 함
		// 접근제어자 : public - protected - (default) - private
		// 예외 개수 많을 수 없음.
		
		// 클래스 변수나 메서드는 클래스에 묶여 있음. 
		// 상속된다는 것이 애초에 의미가 없음. 자손의 것이 아님. 
		
		// 2.3 오버로딩 vs 오버라이딩 -> 알죠?
		
		
	}
}
