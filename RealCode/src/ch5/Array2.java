package ch5;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		// 배열의 초기화
		
		int[] score = new int[5];
		// 이후에 각 요소마다 직접 값을 지정

		// int[] score = new int[] {100,200,300,400,500}
		// int[] score = {100,200,300,400,500} 
		
		//배열의 선언과 생성을 따로 하는 경우에는 new int[]를 생략할 수 없다!
		
		// int add(int[] arr) {int배여을 매개변수로 받는 메서드}
		// 이럴 때도 add()안에 new int[]생략 불가능
		
		int zero[] = new int[0];
		int[] zero1 = new int[] {};
		int[] zero2 = {};
		char[] hello = {'A','B'};
		
		//전부 길이가 0일 배열 -> 후에 쓸 일이 있다!
		
		//---------------------------------------
		
		//배열의 출력
		
		int[] iArr = {100,200,300,400,500};
		for(int i=0; i< iArr.length;i++ ) {
			System.out.print(iArr[i]+" ");
		} 
		System.out.println();
		
		System.out.println(Arrays.toString(iArr));
		// 배열의 각 요소를 아래와 같은 형식의 문자열로 반환하는 메서드
		
		System.out.println(hello);
		// 타입@주소의 형태로 출력, @뒤의 16진수는 배열의 주소로, 실제 주소가 아닌 내부 주소
		
		//예외적으로 char타입 배열은 각 요소가 구분자 없이 출력됨!
		
	}
}
