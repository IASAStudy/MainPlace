package ch7;

public class Interface2 {
	public static void main(String[] args) {
		// 리턴타입이 인터페이스라는 것은 
		// 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것!!!
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
	//	scv.repair(marine); 에러 발생
	}
}
interface Repairable {
}

class Unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "DropShip";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r; // 객체가 Unit에 필요한 것 다 가짐. 
			while(u.hitPoint!=u.MAX_HP) u.hitPoint++;
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
	}
}

