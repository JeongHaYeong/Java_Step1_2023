
package Chapter03.FOR;

public class ForTest_04 {

	public static void main(String[] args) {
		
//		//0-100까지의 수 중 홀수값만 합하기
//		//#1
//		int total=0;
//		int num;
//		
//		for(num=0; num<=100; num++) {
//			if(num%2 == 0)
//				continue; //ignore 그냥 가세요~~~~
//			total+=num;
//			
//			System.out.println("1-100 중 홀수의 합 : " + total);
//			
		//1부터 20까지의 수중 홀수를 출력하세요.
		
		
//		//#2
//			int total=0;
//			int num;
//			
//			for(num=0; num<=20; num++) {
//				if(num%2 != 0)
//				
//				System.out.print(num +" ");			
//			}
			
			//#3
			int total=0;
			int num;
			
			for(num=0; num<=20; num++) {
	        	
	        	if(num%2 == 1)
	        		System.out.println(num);
			}
		
	}
}
