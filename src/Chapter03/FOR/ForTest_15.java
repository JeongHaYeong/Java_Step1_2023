package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_15 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int i,j;
		System.out.println("���� �Է��ϼ��� : ");
		int a=scan.nextInt();
		System.out.println("���� �Է��ϼ��� : ");
		int b=scan.nextInt();
		
		for(i=0; i<a; i++) {
			for(j=0; j<b; j++) {
				System.out.print((i+1)*(j+1) + " ");
			} System.out.println();
		} 
			
		
		
	}
}
