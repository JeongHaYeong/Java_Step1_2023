package Chapter02;

public class Example_02 {

	public static void main(String[] args) {
		// 원의 넓이를 구하시오 (반지름*반지름*3.14)
		//반지름 : 10, 3.14는 double로 정의하여 구하시오. 
		
		//#1
		int num1 = 10;
		double PI = 3.14;
		double result = num1 * num1 * PI;
		
		//#2
		//int num1=10;
		//int num2=3;
		//int num3=14;
						
		// double이 더 정밀한 자료타입으로 int가 묵시적 형변환
		
		// int를 double로 변환: Double.parseDouble
		// string -> int : Integer.parseInt
		
		//double result=num1*num1* Double.parseDouble(num2 + "." +num3);
	
		System.out.println("원의 넓이는 : " + result);
	
		
		
	}
}
