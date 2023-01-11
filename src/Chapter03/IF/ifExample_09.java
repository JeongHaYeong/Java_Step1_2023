package Chapter03.IF;

import java.util.Scanner;

public class ifExample_09 {

	public static void main(String[] args) {
		
		int score=0;
		char grade=' ';
		char opt='0';
		
		System.out.println("점수를 입력해주세요 > ");
		
		Scanner scan=new Scanner(System.in);		
		score=scan.nextInt(); //Integer 정수형 자료를 입력해서 score방에 저장함
		//score=Integer.parseInt(scan.nextLine());
		
		System.out.println("------------------------");
		System.out.println("당신의 점수는 : " + score);
		
//		if (score>=90) {
//			grade='A';
//		}else if (score>=80) {
//			grade='B';
//		}else
//			grade='C';

		//중첩 if
		if (score>=90) {
			grade='A';
			if(score>=98) { 
				opt='+';
			}else if(score>=94) { 
				opt='-'; 
			}	
		}else if (score>=80) {
			grade='B';
			if(score>=88) {
				opt='+';
			}else if(score>=84) { 
				opt='-'; 
			}	
		}else
			grade='C';
		System.out.println("당신의 점수는 " + grade + opt + "입니다. ");
		
	}
}
