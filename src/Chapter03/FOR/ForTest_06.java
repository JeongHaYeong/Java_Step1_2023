package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_06 {

	
	public static void main(String[] args) {
	    
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner scan=new Scanner(System.in);
	//  Ŭ����   ������ �޸� 	
		
		int i; //(�ڷ��� ����) referral ���� �ִ� ���� �ʱ�ȭ��� ��
		int a=scan.nextInt();
		//0���� ũ�鼭 11���� ���� �� 
		
		
		if(0<a && 11>a) {
			
			for(i=1; i<=a; i++) {
				System.out.println("Java  ���α׷���");
			}
		}else {
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}
		
		System.out.println("���α׷��� ����˴ϴ�.");
		
	} //main
} //class
