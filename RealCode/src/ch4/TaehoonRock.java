package ch4;
import java.util.*;
public class TaehoonRock {
public static void main(String[] args) {
	Scanner a= new Scanner(System.in);
	String b=a.nextLine();
	int d=Integer.parseInt(b);
	double c=Math.random();
	if (c>0&c<1.0/3.0) {
		switch(d) {
		case 1:
			System.out.println("draw");
			break;
		case 2:
			System.out.println("win");
			break;
		case 3:
			System.out.println("lose");
			break;
		}
		
	}
	if (c>1.0/3.0&c<2.0/3.0) {
		switch(d) {
		case 1:
			System.out.println("lose");
			break;
		case 2:
			System.out.println("draw");
			break;
		case 3:
			System.out.println("win");
			break;
		}
		
	}
	if (c>2.0/3.0) {
		switch(d) {
		case 1:
			System.out.println("win");
			break;
		case 2:
			System.out.println("lose");
			break;
		case 3:
			System.out.println("draw");
			break;
		}
		
	}
	
}
}
