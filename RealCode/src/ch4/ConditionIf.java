package ch4;

public class ConditionIf {
	public static void main(String[] args) {
		/*
		 * if (조건식) {
		 *    // 조건식이 참일 때 수행될 문장들을 적는다.
		 * }
		 */
		
		String a1 = "yes";
		String a2 = "no";
		
		// if문
		
		if(a1.equals("yes")) { // 대소문자 구분 O
			System.out.println("yes");
		}
		
		if(a2.equalsIgnoreCase("no")) { // 대소문자 구분 X
			System.out.println("no");
		}
		
		//if else문
		
		if(a1 == "yes") {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		/* if else if문
		 * 
		 * if(조건문) {
		 * 		실행문1
		 * } else if(조건문) {
		 * 		실행문2
		 * } else {
		 * 		실행문3
		 * }
		 * 
		 * 
		 * 
		 */

	}
}
