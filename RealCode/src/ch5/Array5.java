package ch5;

public class Array5 {
	public static void main(String[] args) {
		// String 배열
		
		String[] name = new String[3]; // 3개의 문자열을 담는 배열 생성
		
		name[0] = new String("Kim"); // String은 클래스이므로 원래는 new연산자를 통해 객체 생성해야 함
		name[1] = "Jeong"; // 그러나 String에 한해서 큰따옴표만으로 간략히 표현 가능 
		
		// 참조형 배열의 경우, 배열에 저장되는 것 역시 객체의 주소. 
		// String 클래스는 char배열에 기능을 추가한 것 -> String 쓰자.
		// String 객체는 읽을 수만 있을 뿐, 내용을 변경할 수 없다. 
		
		String str = "JAVA";
		str += "8";
		System.out.println(str);
		
		// 여기서도 문자열 str의 내용이 변경되는 것 같으나, 사실 새로운 내용의 문자열이 생성되는 것임. 
		
		// TMI
		// 객체지향개념 이전언어들은 데이터와 기능을 따로 다루었으나, 객제지향언어에서는 데이터와 관련 기능(함수)를 하나의 클래스에 묶어 다룰 수 있게 됨.
		// Java에서는 이러한 기능을 메서드라 부를 것임.
		
		// String 클래스 주요 메서드
		// char charAt(int index)		해당 위치에 있는 문자 반환
		// int length()		길이 반환
		// String substring(int from, int to)	해당 범위에 있는 문자열 반환
		// char[] toCharArray()		문자열을 문자배열로 변환
		// boolean equals(String str)	문자열 내용이 같은지 확인
		
	}
}
