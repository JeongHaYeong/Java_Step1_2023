
package Chapter03.FOR;

public class ForTest_04 {

	public static void main(String[] args) {
		
//		//0-100������ �� �� Ȧ������ ���ϱ�
//		//#1
//		int total=0;
//		int num;
//		
//		for(num=0; num<=100; num++) {
//			if(num%2 == 0)
//				continue; //ignore �׳� ������~~~~
//			total+=num;
//			
//			System.out.println("1-100 �� Ȧ���� �� : " + total);
//			
		//1���� 20������ ���� Ȧ���� ����ϼ���.
		
		
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
