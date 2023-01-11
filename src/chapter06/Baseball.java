package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		//컴퓨터가 발생한 난수 1개
		int com1=0;
		int com2=0;
		int com3=0;
		
		do {
			//2에서 9사이의 난수를 발생
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		} while (com1==com2 || com2==com3 || com1==com3);

		//컴퓨터 준비 완료
		
		//사용자가 입력할 수
		int user1=0;
		int user2=0;
		int user3=0;
		
		while (true) {
			System.out.println("1 ~ 9 사이의 수를 입력하세요--");
			System.out.print("첫번째 수를 수를 입력하세요 :");
			user1=scan.nextInt();//사용자가 준비한 수
			System.out.print("두번째 수를 수를 입력하세요 :");
			user2=scan.nextInt();
			System.out.print("세번째 수를 수를 입력하세요 :");
			user3=scan.nextInt();
			
			int strike=0;
			int ball=0;
			
			//만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같을 확률			
			if(com1==user1) {//만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같으면 strike
				strike++;
			}else if(com1==user2 || com1==user3) {//첫번째(user1) 숫자가 com2 또는 com3랑 숫자가 맞으면 ball
				ball++;
			}
			//------------------------------------------------
			if(com2==user2) {//만약에 com2와 사용자가 입력한 두번째(user2) 숫자가 같으면 strike
				strike++;
			}else if(com2==user1 || com2==user3) {//첫번째(user1) 숫자가 com2 또는 com3랑 숫자가 맞으면 ball
				ball++;
			}
			//------------------------------------------------
			if(com3==user3) {//만약에 com1과 사용자가 입력한 세번째(user3) 숫자가 같으면 strike
				strike++;
			}else if(com3==user1 || com3==user2) {//첫번째(user1) 숫자가 com2 또는 com3랑 숫자가 맞으면 ball
				ball++;
			}
			if(strike==3) {
				System.out.println("정답 "+com1+com2+com3);
				break;
			}else {
				if(strike>0 || ball>0) {
					System.out.println(strike+"Strike, "+ball+"Ball");
				}else {
					System.out.println("Out");
					System.out.println("================================");
				}//in if
			}//out if
			
		}//while
	}//main

}//class 
