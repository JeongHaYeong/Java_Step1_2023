package Chapter03.EXAMPLE;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {
		
//		char gender='M';
//				
//		//gender�� F�� �����Դϴ�. �׷��� ������ �����Դϴ�.
//				
//		
//		if (gender=='F')
//				System.out.println("�����Դϴ�.");
//		else
//			System.out.println("�����Դϴ�.");

		
		System.out.println("�ֹ��Ͻðڽ��ϱ�? ");
			
		Scanner scan=new Scanner(System.in);
		
		String ch;
		ch=scan.nextLine();
				
		if (ch.equals("Y") || ch.equals("y")) { 
			System.out.println("�޴��� �Է��ϼ���. : ");
			String m1=scan.nextLine();
			System.out.println(m1 + "(��)�� �ֹ� �Ϸ�Ǿ����ϴ�.");
		}else
			System.out.println("�̿��� �ּż� �����մϴ�.");
			
		
		
	}
}
