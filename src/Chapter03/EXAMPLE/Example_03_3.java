package Chapter03.EXAMPLE;

import java.util.Scanner;

public class Example_03_3 {

	public static void main(String[] args) {
	
		
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;
		int money = 0, car = 0;
		int num;
		

		
		while(run) {
		System.out.println("----------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("----------------------------");
		System.out.print("���Ͻô� �޴��� ��ȣ�� �Է��� �ּ���.");
		num = scan.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("���ݾ�> " );
					money=Integer.parseInt(scan.nextLine());
					balance += money;
					break;
					
				case 2:
					System.out.print("��ݾ�> ");
					balance -= Integer.parseInt(scan.nextLine());
					break;
					
				case 3:
					System.out.print("�ܰ�> ");
					System.out.println(balance);
					break;
					
				case 4:
					run = false;
					break;
				
		}
			System.out.println("-----------------");
			System.out.println("1.�ʱ�޴� | 2.����");
			System.out.println("-----------------");
			System.out.print("����> ");
			int option = Integer.parseInt(scan.nextLine());
					switch (option) {
					case 1:
						break;
					case 2: 
						run = false;
						break;
					}
					
		}
		System.out.println("���α׷� ����");
			
				
		
		
		
	}
}
