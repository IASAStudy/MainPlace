package ch7;

public class Interface1 {
	public static void main(String[] args) {
		// 추상 클래스 : 미완성 설계도
		// 인터페이스 : 기본 설계도
		
		// 7.1 인터페이스
		// 추상메서드와 상수만을 가짐 not instance member
		// 보통 able로 끝나는 이유 : 이런 기능을 할 수 있다는 의미 강조
		// 오버라이딩 시에는 항상 조상의 메서드보다 넓은 범위 사용해야 함. 
		
		// 7.4 인터페이스를 통한 다중상속
		// 다중상속이 필요하다면, 비중이 높은 쪽 선택 후 
		// 나머지는 클래스내부로 포함시키거나, 
		// 어느한 쪽의 필요한 부분을 인터페이스로 뽑아서 구현
		// 길게 뽑아 쓸 필요가 없음. 
	}
}
class Tv {
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() { power = !power;}
	public void channelUp() { channel++;}
	public void channelDown() { channel--;}
	public void volumeUp() { volume++;}
	public void volumeDown() { volume--;}
}

class VCR {
	protected int counter;
	public void play() {}
	public void stop() {}
	public void reset() {
		counter=0;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int c) {
		counter=c;
	}
}
interface IVCR {
	public void play();
	public void stop();
	public void reset();
	public int getCounter();
	public void setCounter(int c);
}

class TVCR extends Tv implements IVCR {
	VCR vcr = new VCR();
	public void play() {
		vcr.play();
	}
	public void stop() {
		vcr.stop();
	}
	public void reset() {
		vcr.reset();
	}
	public int getCounter() {
		return vcr.getCounter();
	}
	public void setCounter(int c) {
		vcr.setCounter(c);
	}
}










