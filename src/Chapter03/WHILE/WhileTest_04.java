package Chapter03.WHILE;

import java.util.Scanner;

public class WhileTest_04 {

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Java ������ ������ �Է��ϼ��� : ");
			int scr=scan.nextInt(); 
			
			//0�̸��̰ų� �Ǵ� 100�ʰ��� while�� ����, 60�� �̻��̸� �հ� �׷��� ������ ���հ�
			
			if (scr<0 || scr>100) {
				break;
			}	
			else if (scr>=60) {
				System.out.println("�հ�");
								
			}else {
				System.out.println("���հ�");
				
		
			} //if			
		} //while
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	
	
	
	}
}
