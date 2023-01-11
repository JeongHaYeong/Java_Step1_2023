package Chapter03.EXAMPLE;

import java.util.Scanner;

public class Example_04 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;

		int balance = 0, money=0;
		
		while(run) {
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택> ");
		
		int num = Integer.parseInt(scan.nextLine()); //String str
		balance = scan.nextInt();
			
		switch(num) {
			case 1:
				System.out.print("예금액> " );
				balance=scan.nextInt();
				balance += money;
				break;
			
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scan.nextLine());
				  if (balance - money < 0) {
					 System.out.println("잔액이 부족합니다.");
				 }else  {
					 balance -= money;
				 }
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
