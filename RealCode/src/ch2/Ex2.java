package ch2;
/* Primitive type
 * boolean,char,byte,short,int,long,float,double
 * 총 8가지
 */

/* Reference type
 * Primitive type을 제외한 나머지 타입
 * 클래스의 이름
*/

public class Ex2 {
	public static void main(String[] args) {
		final int a = 5; //상수; 저장과 동시에 초기화해야 함.
		final int b = 10;
		// 원래 우리가 알던 상수가 리터럴임. 
		// 리터럴에는 접미사가 요구됨.
		
		String name = "Java" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+""); // 빈 문자열을 넣어줌으로써 문자열로 변환
		System.out.println(7+" ");
		System.out.println(7+7+"");
		System.out.println(""+7+7);
		
		System.out.printf("nan");
		
		System.out.printf("age %d%n", a); // 형식화된 출력방식
		
		System.out.printf("finger= [%5d]%n",b);
		System.out.printf("finger= [%-5d]%n", b);
		System.out.printf("finger= [%05d]%n", b);
		
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url); // 문자열 길이만큼 출력공간 확보
		System.out.printf("[%20s]%n", url); // 최소 20글자 출력공간 확보(우측 정렬)
		System.out.printf("[%-20s]%n", url); // 최소 20글자 출력공간 확보(죄측 정렬)
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력.
		
		
	}
}
