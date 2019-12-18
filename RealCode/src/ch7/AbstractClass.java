package ch7;

public class AbstractClass {
	public static void main(String[] args) {
		// 6.1 추상클래스 : 미완성 메서드 포함
		// 조상으로부터 상속받은 추상메서드 모두 구현해야 함. 
		// 강제성을 부여하기 위함. 
		
		// 6.3 
		// 메서드는 참조변수 타입에 영향받지 않는다는 것 상기
		// 추상메서드가 아닌 구현된 메서드 실행하는 것임.
		// Object[] group = new Object[4];는 될까?	
	}
}
/*
abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {};
}

class Marine extends Unit {
	void move(int x,int y) { };
	void stimPack() {};
}

class Tank extends Unit {
	void move(int x,int y) { };
	void changemode() {};
}

class Dropship extends Unit {
	void move(int x,int y) { };
	void load() {};
	void unload() {};
}
*/