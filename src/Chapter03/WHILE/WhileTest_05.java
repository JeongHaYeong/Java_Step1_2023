package Chapter03.WHILE;

import java.util.Scanner;

public class WhileTest_05 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num, count=0, sum=0;
		double average;
		
//		//0을 입력하면 중지
//		while(true) {
//			System.out.println("정수를 입력하세요");
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
//		//정수형 숫자를 입력 받아서 입력된 자료의 갯수
//		 System.out.println("입력된 자료의 개수: " + count);
//		//정수형 숫자를 입력 받아서 입력된 자료의 합계
//		 System.out.println("입력된 자료의 합계: " + sum);	 
//		//정수형 숫자를 입력 받아서 입력된 자료의 평균 (단, 평균은 double)
//		 System.out.println("입력된 자료의 평균: " + average);
		 
		 
		 while(true) {
			 
			 num=scan.nextInt();
			 
			 if(num == 0) {
				 break;
			 }
			 
			 count++;
			 sum +=num;
		 }
			 
			
		//정수형 숫자를 입력 받아서 입력된 자료의 갯수
		 System.out.println("입력된 자료의 개수: " + count);
		//정수형 숫자를 입력 받아서 입력된 자료의 합계
		 System.out.println("입력된 자료의 합계: " + sum);	 
		//정수형 숫자를 입력 받아서 입력된 자료의 평균 (단, 평균은 double)
		 System.out.println("입력된 자료의 평균: " + sum/(double)count);
					 

		 
		 
		 
		 
		 
	}

}
