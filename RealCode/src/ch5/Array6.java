package ch5;

public class Array6 {
	public static void main(String[] args) {
		// 커맨드 라인을 통해 입력받기
		
		// scanner 클래스 없이도 문자열 전달 가능
		
		System.out.println("매개변수의 개수:" + args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+ i +"] = \""+args[i] + "\"");
		}
		
		// 만일 입력된 매개변수가 없다면 args의 값은 null이 되어 이와 관련된 모든 코드에서 에러가 발생 할 것!
		// 그러나 JVM은 이럴 경우 크기가 0인 배열을 생성해서 args에 전달
	}
}
