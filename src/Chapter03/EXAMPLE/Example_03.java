package Chapter03.EXAMPLE;

import java.util.Scanner;

public class Example_03 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;

		int balance = 0;
		
		while(run) {
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택> ");
		
		int num = Integer.parseInt(scan.nextLine()); //String str
		// balance = scan.nextInt();
			
		switch(num) {
			case 1:
				System.out.print("예금액> " );
				int money=Integer.parseInt(scan.nextLine());
				balance += money;
				break;
			
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scan.nextLine());
				break;
				
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
				
			case 4:
				run = false;
				break;
				
		}
			System.out.println();
						
		}
		System.out.println("프로그램 종료");
			
				
		
				
		
	}
}
