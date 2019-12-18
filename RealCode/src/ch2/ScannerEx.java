package ch2;

import java.util.*;


public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력을 위한 Scanner객체 생성

		String input = scanner.nextLine(); // 입력대기 상태 -> 입력 후 엔터키 누르면 입력한 내용이 문자열로 반환
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환, 기호나 문자가 입력되면 error발생

		System.out.println("�Է³��� :" + input); // input은 문자열
		System.out.printf("num=%d%n", num); // num은 숫자형..
		System.out.println();

	}
}
