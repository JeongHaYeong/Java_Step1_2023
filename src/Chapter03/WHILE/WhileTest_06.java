package Chapter03.WHILE;

import javax.swing.JOptionPane;

public class WhileTest_06 {

	public static void main(String[] args) {
		
//		int num=1;
//		int sum=0;
//		
//		do {
//			sum += num; //1�� ����
//			num++; //2
//		}while(num<=10);
//			System.out.println("1���� 10������ �� : " + sum);
		
		
		int num1, num2;
		do {
		num1=Integer.parseInt(JOptionPane.showInputDialog("OTP DB")); //DB
		num2=Integer.parseInt(JOptionPane.showInputDialog("OTP USER")); //������Է�
		if(num1 == num2) {
			System.out.println("���!");
			break;
		}
		System.out.println("�ٽ� �Է��ϼ���!");
		
		}while(num1 != num2);
		
		
	}
}