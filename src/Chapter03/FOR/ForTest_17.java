package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_17 {

	public static void main(String[] args) {
		//������ �Է¹޾Ƽ� �Էµ� ����ŭ ��
		
		Scanner scan=new Scanner(System.in);
		 
		int i, j;
				 
		System.out.print("���ڸ� �Է��ϼ��� : "); 
		int n=scan.nextInt();
		
		for(i=1; i<=n; i++) {
		  for(j=1;j<=i;j++) {
			  System.out.print("��");
		  }
		  System.out.println();
		}

	}
}
