package Chapter03.WHILE;

import java.util.Scanner;

public class WhileTest_07 {

	public static void main(String[] args) {
		//1.�Է��ϱ�
		//2.����ϱ�
		//3.�����ϱ�
		//4.������
		//�׿� : �۾��� ��ȣ�� �����ϼ���.
		
		String menu=" ";
		
		//do�� ������ ������ ������ �ؾ���

		Scanner scn = new Scanner(System.in);
		int num;
		

		do
		{
			System.out.println("1.�Է��ϱ�");
			System.out.println("2.����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.������");
			System.out.print("�۾��� ��ȣ�� �����ϼ���.: ");
			num = scn.nextInt();
			
			
			
			//����ó��
			if(num < 1 || num > 3) //
			{
				if( num == 4)
				{
					break;
				}
				menu = "�߸�";
			}
			else
			{
				if(num == 1)
				{
					menu = "�Է��ϱ⸦";
				}
				else if(num == 2)
				{
					menu = "����ϱ⸦";
				}
				else if(num == 3)
				{
					menu = "�����ϱ⸦";
				}
			}
			System.out.printf("\n%s �����Ͽ����ϴ�.\n\n", menu);

		}while(num != 4);
	
		System.out.print("\n�����⸦ �����Ͽ����ϴ�.");
	
		
	}
}
	
			
			
			
			
//		if(a == 1) {
//				System.out.println("�Է��ϱ⸦ �����Ͽ����ϴ�.");
//				break;
//				
//		}else if(a == 2) {
//				System.out.println("����ϱ⸦ �����Ͽ����ϴ�.");
//				break;
//				
//		}else if(a == 3) {
//				System.out.println("�����ϱ⸦ �����Ͽ����ϴ�.");
//				break;
//				
//		}else if(a == 4) {
//				System.out.println("�����ϱ⸦ �����Ͽ����ϴ�.");
//				break;
//				
//		}else {
//				System.out.println("�߸� �����Ͽ����ϴ�.");
//				
//		} System.out.println();
//		}while(true);
//		

	
