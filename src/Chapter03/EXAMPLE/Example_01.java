package Chapter03.EXAMPLE;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		//����ó������� �� ������ ���䰳���� int�� Ÿ���� ���� 5���� �����ϰ� �Է¹�������. (�Է��� Scanner class ���)
		//����Ʈ���� ����(soft1), ����Ʈ���� ����(soft2), �����ͺ��̽� ����(DB), ���α׷��־��Ȱ��(pro), �����ý��� ����(os)
		//�� �����̶� 8�� �̸�, ����� 60�� �̸��� ��� (OR ||) ��� ���հ��Դϴ�. �� ���
		// �׷��� ������ �հ��Դϴ�.�� ���
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("����Ʈ���� ���� ���� : ");
		//int soft1=Integer.parseInt(scan.nextLine());
		int soft1=scan.nextInt();	
		
		System.out.println("����Ʈ���� ���� ���� : ");
		//int soft2=Integer.parseInt(scan.nextLine());
		int soft2=scan.nextInt();
		
		System.out.println("�����ͺ��̽� ���� ���� : ");
		//int DB=Integer.parseInt(scan.nextLine());
		int DB=scan.nextInt();
		
		System.out.println("���α׷��־�� Ȱ�� ���� : ");
		//int pro=Integer.parseInt(scan.nextLine());
		int pro=scan.nextInt();
		
		System.out.println("�����ý��� ���� ���� : ");
		//int os=Integer.parseInt(scan.nextLine());
		int os=scan.nextInt();
		
		int total = soft1+soft2+DB+pro+os;
		float average =(total)/5f;
		
		if (soft1 < 8 || soft2 < 8 || DB < 8 || pro < 8 || os < 8 || average <60)
				System.out.println("���հ��Դϴ�.");
		
		else
				System.out.println("�հ��Դϴ�.");
		
		

		
	}
}
