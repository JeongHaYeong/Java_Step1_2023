package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_07 {

	public static void main(String[] args) {
		//정수를 입력받아 입력받은 정수부터 100까의 합을 출력하시오.
		
		Scanner scan=new Scanner(System.in);
//		System.out.print("정수를 입력하세요 :");
//		
//		int i;
//		int a=scan.nextInt();
//		int sum=0; //0으로 초기화
//
//		for(i=a; i<=100 ; i++) {		
//			sum+=i; //sum=sum+i
//		}		
//		System.out.println(a +"에서 100까지의 합 :" + sum);
		System.out.println("==========================");
		
		//10개의 정수를 입력받아 그 수들중 짝수의 갯수가 몇개인지 출력하시오
		System.out.print("10개의 정수를 입력하세요 :");
		
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
		 System.out.println("입력받은 수의 짝수의 갯수는 :" + cnt);
		
	}
}
