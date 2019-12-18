package ch3;

public class OperatorIntro {
	public static void main(String[] args) {
		// 대부분은 우리가 아는 상식 상의 순서
		int x = 1;
		System.out.println(x);
		int y = x << 2 + 1; // 쉬프트는 덧셈보다 우선순위가 낮다. 따라서 x << (2+1)이 실행된다.
		System.out.println(y);
		
		boolean a = true;
		boolean b = a & 1 == 0; // 논리연산자가 비교연산자보다 우선순위가 낮다. 따라서 a & (1==0)이 되는 것.
		System.out.println(b);
		
		// &&가 ||보다 우선순위가 높으므로, 괄호를 쳐주는 습관을 들이자.
		
		x = 0;
		boolean c = x < -1 || (x >3 && x<5); 
		System.out.println(c);
		
		//딱히 중요한 건 별로 없음 거의 다 비슷하고, 그때그때 찾는 것이 더 편할 듯
	
	}
}