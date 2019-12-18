package ch4;

import java.util.*;

public class ConditionSwitch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // 입력대기 상태 -> 입력 후 엔터키 누르면 입력한 내용이 문자열로 반환
		int level = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환, 기호나 문자가 입력되면 error발생
		
		switch(level) {
		case 3:
			//grantDelete() 
		case 2: 
			//grandWrite()
		case 1: case 0: // 1일때와 0일 때
			//grantRead()
		}
		
		//사용자에게 읽기, 쓰기, 삭제권한을 주는 기능의 클래스들이 존재한다고 가정하에 작성
		// 회원제로 운영되는 웹사이트에서 많이 사용될만한 코드
		// 3은 삭제, 쓰기, 읽기 권한 모두 존재/ 조건문을 나가려면 break;필요
		
		// 제약조건
		// 1. 조건식 결과는 정수또는 문자열이어야 함
		// 2. case문의 값은 정수, 상수만 가능하며, 중복X
		
		// 예제1
		// 현재 몇 월인지 입력받아 해당하는 계쩔 출력하는 문제
		
		// 예제2
		// Math.random() 은 0과 1사이의 임의의 실수를 반환하는 메서드이다. 이를 이용하여 컴퓨터랑 하는 ㅎ가위바위보게임을 만들어라.
	}
}
