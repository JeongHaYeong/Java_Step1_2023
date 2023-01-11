package Chapter03.IF;

import java.util.Scanner;  // Ctrl shift o

public class ifExample_07 {

	public static void main(String[] args) {
		//사용자로부터 값을 입력받고 싶을 때는 Scanner라는 클래스를 사용
		//입력 Scanner class 초기화 인스턴스 변수방(scan) 선언
		Scanner scan=new Scanner(System.in); 
//		클래스이름	객체이름	 클래스이름 입력스트림			    
		
		//num1
		System.out.println("1. 첫번째 수");
		double num1=Double.parseDouble(scan.nextLine());
		System.out.println("--------------------");
		System.out.println("첫번째 입력받은 수 출력 :" + num1);
		System.out.println();
				
		//num2
		System.out.println("2. 두번째 수");
		double num2=Double.parseDouble(scan.nextLine());
		System.out.println("--------------------");
		System.out.println("두번째 입력받은 수 출력 :" + num2);
		System.out.println();
		
		//num1/num2 기능 구현중 이다 num2가 0.0이 아니면 수행, 만약에 0이면 "0으로 나눌 수 없습니다."

//		if (num2!=0.0)
//			System.out.println("나눈 값 : " + num1/num2);
//		
//		else
//			System.out.println("0으로 나눌수가 없습니다.");
				
		if (num2==0.0)	
			System.out.println("0으로 나눌수가 없습니다.");	
		else
		{
			double result = num1/num2;
			System.out.println(result);
		 }	
		
		
	}
}
