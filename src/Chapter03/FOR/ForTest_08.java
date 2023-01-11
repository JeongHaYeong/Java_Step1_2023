package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_08 {

	public static void main(String[] args) {
		//10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하세요.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int b, cnt3=0, cnt5=0;
		
		for(int i=1; i<=10; i++) {
			b=scan.nextInt();
						
			if(b%3 == 0)
				//System.out.print("3의 배수 :" + b);
				cnt3++;
			System.out.println();	
			if(b%5 == 0)
				//System.out.print("5의 배수 :" + b);
				cnt5++;
						
		} //for
		
		System.out.println("3의 배수 :" +cnt3 + "개");
		System.out.println("3의 배수 :" +cnt5 + "개");
		
		
		
		
	}
}
