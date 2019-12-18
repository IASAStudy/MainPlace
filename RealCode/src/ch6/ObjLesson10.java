package ch6;

public class ObjLesson10 {
	public static void main(String[] args) {
		// 초기화 블럭을 사용한 예쩨 
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호는 " + p1.serialNo);
		System.out.println("p2의 제품번호는 " + p2.serialNo);
		System.out.println("p3의 제품번호는 " + p3.serialNo);
		
		System.out.println("생산된 제품번호는 모두 "+Product.count +"개입니다." );
	}
}

class Product {
	static int count = 0;
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
}


