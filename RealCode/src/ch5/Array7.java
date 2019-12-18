package ch5;

import java.util.Arrays;

public class Array7 {
	public static void main(String[] args) {
		// 다차원 배열 생성
		
		int[][] score = new int[4][3];
		System.out.println(score[0]);
		// 4행 3열의 2차원 배열 생성
		
		int[][] arr = new int[][] {
			{1,2,3},
			{2,3,4}
		};
		System.out.println(Arrays.toString(arr));
		// 역시 생성과 초기화를 동시에 할 수 있다. 단, 괄호를 한 번 더 사용해야 함. 
		// new int[][] 생략도 역시 가능함. 
			
			
		// 다차원 배열이 메모리에 어떤 형태로 만들어지는지 설명
		// 2차원 배열은 배열의 배열 형태로 구성됨!
		// score.length는 얼마일까?? -> not 12
		
		// 가변배열
		
		
		// 배열의 활용문제 
		// 입력한 과표의 위치에 X표 표시
		// 빙고; 빙고판을 만들고 입력받은 숫자를 빙고판에서 지운다. 
		// 행렬의 곱셈; 두 행렬을 곱한 결과를 출력
		
		// 중 택 1
		
	}
}
