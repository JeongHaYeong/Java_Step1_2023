package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_08 {

	public static void main(String[] args) {
		//10���� ������ �Է¹޾� 3�� ����� 5�� ����� ���� ����ϼ���.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		int b, cnt3=0, cnt5=0;
		
		for(int i=1; i<=10; i++) {
			b=scan.nextInt();
						
			if(b%3 == 0)
				//System.out.print("3�� ��� :" + b);
				cnt3++;
			System.out.println();	
			if(b%5 == 0)
				//System.out.print("5�� ��� :" + b);
				cnt5++;
						
		} //for
		
		System.out.println("3�� ��� :" +cnt3 + "��");
		System.out.println("3�� ��� :" +cnt5 + "��");
		
		
		
		
	}
}
