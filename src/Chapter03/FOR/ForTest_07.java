package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_07 {

	public static void main(String[] args) {
		//������ �Է¹޾� �Է¹��� �������� 100���� ���� ����Ͻÿ�.
		
		Scanner scan=new Scanner(System.in);
//		System.out.print("������ �Է��ϼ��� :");
//		
//		int i;
//		int a=scan.nextInt();
//		int sum=0; //0���� �ʱ�ȭ
//
//		for(i=a; i<=100 ; i++) {		
//			sum+=i; //sum=sum+i
//		}		
//		System.out.println(a +"���� 100������ �� :" + sum);
		System.out.println("==========================");
		
		//10���� ������ �Է¹޾� �� ������ ¦���� ������ ����� ����Ͻÿ�
		System.out.print("10���� ������ �Է��ϼ��� :");
		
		int b, j, cnt=0;
		
	
		for(j=1; j<=10; j++) {
			b=scan.nextInt();
			
			if(b==0) {
				continue;
			}
			
			if(b%2==0) {
				cnt++; //cnt=cnt+1;
			}
					
		} //for
		 System.out.println("�Է¹��� ���� ¦���� ������ :" + cnt);
		
	}
}
