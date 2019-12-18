package ch6;

class Data { int x; }

public class ObjLesson5 {
	public static void main(String[] args) {
		// Primitive Parameters
		Data d = new Data();
		d.x = 10; // 인스턴스 변수
		System.out.println("main() : x = " +d.x);
		
		change(d.x);
		System.out.println("After change(d.x");
		System.out.println("main() : x =" +d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	// Reference Parameters
	
	/*
	 * static void change(Data d) {
	 * 		d.x = 1000;
	 * 		System.out.println("change() : x = " + d.x);
	 * }
	 */ 
	
	// 반환타입 역시 참조형이 될 수 있다!! 
}
