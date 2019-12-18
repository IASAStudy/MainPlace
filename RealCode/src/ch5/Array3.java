package ch5;

public class Array3 {
	public static void main(String[] args) {
		//배열의 복사
		
		//배열은 한 번 생성시 그 길이를 변경할 수 없다.
		//따라서 큰 배열을 만들고 이전 배열로부터 내용을 복사해야 함.
		
		int[] arr = new int[] {100,200,300,400,500};
		
		int[] tmp = new int[arr.length *2]; //두배길이 배열 선언 및 생성
		
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i]; // 각요소 복사
		}
		
		arr = tmp; // tmp배열의 주소를 arr배열 참조변수에 저장
		
		//기존 arr배열 값들은 JVM의 가비지 컬렉터에 의해 메모리에서 자동 제거
		
		char[] abc = {'A','B','C','D'};
		char[] num = {'1','2','3','4','5','6','7','8','9'};
		
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		
		System.out.println(result);
		
	
		
	}
}
