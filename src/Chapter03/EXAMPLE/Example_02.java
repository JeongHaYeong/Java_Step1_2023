package Chapter03.EXAMPLE;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {
		
//		char gender='M';
//				
//		//gender가 F면 남성입니다. 그렇지 않으면 여성입니다.
//				
//		
//		if (gender=='F')
//				System.out.println("남성입니다.");
//		else
//			System.out.println("여성입니다.");

		
		System.out.println("주문하시겠습니까? ");
			
		Scanner scan=new Scanner(System.in);
		
		String ch;
		ch=scan.nextLine();
				
		if (ch.equals("Y") || ch.equals("y")) { 
			System.out.println("메뉴를 입력하세요. : ");
			String m1=scan.nextLine();
			System.out.println(m1 + "(가)이 주문 완료되었습니다.");
		}else
			System.out.println("이용해 주셔서 감사합니다.");
			
		
		
	}
}
