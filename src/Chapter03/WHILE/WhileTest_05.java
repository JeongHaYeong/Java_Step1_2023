package Chapter03.WHILE;

import java.util.Scanner;

public class WhileTest_05 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num, count=0, sum=0;
		double average;
		
//		//0�� �Է��ϸ� ����
//		while(true) {
//			System.out.println("������ �Է��ϼ���");
//			int num=scan.nextInt();
//			sum+=num;
//			count++;
//			average=sum/count;	
//			
//			if (num == 0)
//				break;
//
//		
//		 	
//		//������ ���ڸ� �Է� �޾Ƽ� �Էµ� �ڷ��� ����
//		 System.out.println("�Էµ� �ڷ��� ����: " + count);
//		//������ ���ڸ� �Է� �޾Ƽ� �Էµ� �ڷ��� �հ�
//		 System.out.println("�Էµ� �ڷ��� �հ�: " + sum);	 
//		//������ ���ڸ� �Է� �޾Ƽ� �Էµ� �ڷ��� ��� (��, ����� double)
//		 System.out.println("�Էµ� �ڷ��� ���: " + average);
		 
		 
		 while(true) {
			 
			 num=scan.nextInt();
			 
			 if(num == 0) {
				 break;
			 }
			 
			 count++;
			 sum +=num;
		 }
			 
			
		//������ ���ڸ� �Է� �޾Ƽ� �Էµ� �ڷ��� ����
		 System.out.println("�Էµ� �ڷ��� ����: " + count);
		//������ ���ڸ� �Է� �޾Ƽ� �Էµ� �ڷ��� �հ�
		 System.out.println("�Էµ� �ڷ��� �հ�: " + sum);	 
		//������ ���ڸ� �Է� �޾Ƽ� �Էµ� �ڷ��� ��� (��, ����� double)
		 System.out.println("�Էµ� �ڷ��� ���: " + sum/(double)count);
					 

		 
		 
		 
		 
		 
	}

}
