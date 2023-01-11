package Chapter03.FOR;

public class ForTest_03 {

	public static void main(String[] args) {
		//1부터 100까지의 합을 구하되 합이 100이하이면서 가장 가까운 수
	
//		//#1
//		int s;
//		int sum=0;
//		
//		for(s=1; s<=100; s++) {
//			sum += s;
//			if (sum<100) 
//			System.out.println("숫자 " + s + "까지의 합 : " + sum + "입니다." );

		//#2
		int s;
		int sum=0;
			
		for(s=1; s<=100; s++) {
			sum += s;
			if (sum>= 100)
			break;				
		}
	
		System.out.println("해당 숫자 : " + (s-1) + "입니다." );
		System.out.println("숫자 " + (s-1) + "까지의 합 : " + (sum-s) + "입니다." );

		
		
//		//#3
//		System.out.println("1부터 100까지의 합을 구하되 합이 100을 초과하는 첫번째 수와 합");
//		int s;
//		int sum=0;
//		for(s=1; sum<100; s++) {
//			System.out.println("숫자 " + (s-1) + "까지의 합 : " + (sum-s) + "입니다." );
//			sum += s;
//		}
					
	
	}
}
