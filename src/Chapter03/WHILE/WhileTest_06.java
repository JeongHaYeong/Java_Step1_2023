package Chapter03.WHILE;

import javax.swing.JOptionPane;

public class WhileTest_06 {

	public static void main(String[] args) {
		
//		int num=1;
//		int sum=0;
//		
//		do {
//			sum += num; //1씩 증가
//			num++; //2
//		}while(num<=10);
//			System.out.println("1부터 10까지의 합 : " + sum);
		
		
		int num1, num2;
		do {
		num1=Integer.parseInt(JOptionPane.showInputDialog("OTP DB")); //DB
		num2=Integer.parseInt(JOptionPane.showInputDialog("OTP USER")); //사용자입력
		if(num1 == num2) {
			System.out.println("통과!");
			break;
		}
		System.out.println("다시 입력하세요!");
		
		}while(num1 != num2);
		
		
	}
}
