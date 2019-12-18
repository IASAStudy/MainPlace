package ch4;

public class IterationFor {
	public static void main(String[] args) {
		/* 
		 * for(초기화;조건식;증감식) {
		 * 		조건식이 참일 때 수행될 문장
		 * }
		 */
		
		//예제 : 1부터 10까지의 합
		
		int sum =0;
		for(int i=1;i<=10;i++) {
			sum = sum + i;
			System.out.printf("1부터 %d까지의 합 = %d%n",i, sum);
		}
		
		// 중복 for문도 당연히 가능
		// 예제 : 입력받은 라인의 수를 받아 별 출력
	}
}
