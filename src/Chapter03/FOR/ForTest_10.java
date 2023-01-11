package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_10 {

	public static void main(String[] args) {
		//값을 입력받아서 1부터 차례로 누적하여 합을 구하되 합이 입력받은 수를 넘으면 중단하고 최종합을 출력
		
		Scanner scan=new Scanner(System.in);
		
		int i, sum=0;

		System.out.println("정수를 입력하세요 :"); 
		int a=scan.nextInt();
		
		for(i=1; ; i++) {
			
			if(sum>a) {
				break;
			}
			sum+=i;
		}
			
		System.out.println(i-1 + "최종합 :" + sum);
		
	}
}
