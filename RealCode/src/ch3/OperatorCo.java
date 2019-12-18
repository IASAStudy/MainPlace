package ch3;

public class OperatorCo {
	public static void main(String[] args) {
		int x;
		int absX;
		char signX;
		x = 10;
		
		absX = x>=0 ? x : -x;
		
		signX = x>0 ? '+': ( x ==0 ? ' ': '-' );
		
		System.out.printf("x = %c%d%n", signX,absX);
	}
}
