package chapter03.IF.Example;

import java.util.Scanner;

public class ExampleWhile03 {

	public static void main(String[] args) {
		// 
		
		boolean run = true;
		int num, num2;
		
		int save = 0;
		int money;
		
		Scanner sc = new Scanner(System.in);
		
		//if() {} | switch(key) {case} | for(){} | while() | do{} while()
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("예금을 선택하셨습니다");
				System.out.println("현재 금액 : " + save);
				System.out.print("입금할 금액을 입력하세요 : ");
				money = sc.nextInt();
				save += money;
				
				if(money < 0) {
					System.out.println("금액을 잘못 입력하셨습니다");
				} 
			} else if(num == 2) {
				System.out.println("출금을 선택하셨습니다");
				System.out.println("현재 금액 : " + save);
				System.out.print("출금할 금액을 입력하세요 : ");
				money = sc.nextInt();
				save -= money;
				
				if(save < 0) {
					System.out.println("잔액이 부족합니다");
					save += money;
				}
				
			} else if(num == 3) {
				System.out.println("잔액확인을 선택하셨습니다");
				System.out.println("현재 금액 : " + save );
				
			} else if(num ==4) {
				System.out.println("종료를 선택하셨습니다");
				run = false;
				
			} else {
				System.out.println("잘못된 서비스 번호를 선택하셨습니다");
			}
			
			System.out.println("1. 초기메뉴 2. 종료");
			num2 = sc.nextInt();
			
			if(num2 == 2) {
				run=false;
			} else if(num2 == 1){
				run=true;
			}
			
		}
		
		System.out.println("프로그램이 종료됩니다");

	}

}