package Chapter03.IF;

import java.util.Scanner;

public class ifExample_09 {

	public static void main(String[] args) {
		
		int score=0;
		char grade=' ';
		char opt='0';
		
		System.out.println("������ �Է����ּ��� > ");
		
		Scanner scan=new Scanner(System.in);		
		score=scan.nextInt(); //Integer ������ �ڷḦ �Է��ؼ� score�濡 ������
		//score=Integer.parseInt(scan.nextLine());
		
		System.out.println("------------------------");
		System.out.println("����� ������ : " + score);
		
//		if (score>=90) {
//			grade='A';
//		}else if (score>=80) {
//			grade='B';
//		}else
//			grade='C';

		//��ø if
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
		System.out.println("����� ������ " + grade + opt + "�Դϴ�. ");
		
	}
}
