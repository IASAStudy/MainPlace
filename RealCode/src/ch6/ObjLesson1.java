package ch6;


public class ObjLesson1 {
	public static void main(String[] args) {
		// ch6-1
		
		// 클래스는 제품 설계도, 객체는 제품
		// 객체는 다른 말로 인스턴스
		// 객체는 변수(속성)꽈 기능(메서드)로 이루어져 있다. 
		
		// 2.4
		// 인스턴스의 생성과 사용
		
		Tv t; // 주소를 저장할 참조변수 선언
		t = new Tv(); // 연산자 new에 의해 Tv클래스의 인스턴스 생성, 각 변수들은 자료형 별 디폴트값으로 초기화
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);
		
		// String이랑 똑같죠? String class의 객체 생성과 같음
		// 참조변수의 타입은 인스턴스의 타입과 동일해야 함. 
		
		// 우리가 C에서 배운 구조체는 여러 자료형들이 모인 것. 클래스는 기능이 더해진 것
		
		Tv[] tvArr = new Tv[3];
		// 객체 역시 배열로 다룰 수 있다. 
		// 여러 참조변수들은 하나로 묶은 참조 변수 인 것.
		
		// 아직 초기화는 하지 않았기에 객체는 저장이 되지 않은 상태임을 명시하자!
		
		tvArr[0] = new Tv(); // 이 과정을 해야 비로소 객체가 생성된 것임
		
	}
}


class Tv {
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널
	
	void power() {power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}
