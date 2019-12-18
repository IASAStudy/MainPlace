package ch4;

public class ImprovedFor {
	public static void main(String[] args) {

		//for문 내부에 문장이 하나뿐이라면 중괄호는 생략할 수 있다. 
		
		int[] arr = {10,20,30,40,50};
		
		for(int tmp : arr) {
			System.out.printf("%d%n", tmp);
		}
		
		//continue문 : 자신이 포함된 반복문의 끝으로 이동
		
		for(int i=0; i<=10; i++) {
			if(i%3 == 0) 
				continue;
			System.out.println(i);
		}
		
		//break문 : 자신이 포함된 반복문 종료
	}
}
