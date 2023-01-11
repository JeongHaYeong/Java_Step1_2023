package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_18 {

	public static void main(String[] args) {
		//정수를 입력받아서 입력된 수만큼 ★
		
		Scanner scan=new Scanner(System.in);
		 
		int i, j;
				 
		System.out.print("숫자를 입력하세요 : "); 
		int n=scan.nextInt();
		
		
		for(i=1; i<=n; i++) {
			  for(j=1; j<=n-i; j++) { 
				  System.out.print(" ");	
			  }
			  for(j=1; j<=i; j++) {
				  System.out.print("★");
			  }
			  System.out.println();
			}

//		int i, j, k;
//		for(i=0; i<n; i++) {
//		  for(j=n-1;j>i;j--) 
//			  System.out.print(" ");
//		  for(k=0;k<=i;k++) 
//			  System.out.print("★");
//		  System.out.println();
//		}


	}
}
