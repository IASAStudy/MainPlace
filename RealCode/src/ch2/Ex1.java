package ch2;

public class Ex1 {
	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
	}
}

/* 대소문자 구분
 *  예약어 사용 X
 *  숫자로 시작 X
 *  특수문자는 _와 $만 가능
 */
