package ch4;
import java.util.*;

public class Ex_StarbyLine {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String tmp = a.nextLine();
		
		int line = Integer.parseInt(tmp);
		
		for(int i =1; i<=line; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
