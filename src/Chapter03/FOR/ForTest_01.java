package Chapter03.FOR;

public class ForTest_01 {

	public static void main(String[] args) {
		
		//1���� 10������ ��
//		int sum=1;
//		
//		sum+=2;
//		sum+=3;
//		sum+=4;
//		sum+=5;
//		sum+=6;
//		sum+=7;
//		sum+=8;
//		sum+=9;
//		sum+=10;
//		
//		System.out.println(sum);
		
		int i;
		
		System.out.println("1���� 10������ �� ���");
		for(i=1; i <=10; i++) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		
		int j;
		int sum=0;
		
		for(j=1; j<=10; j++) {
			System.out.print(j +" ");
			sum += j;
		}
	
		System.out.println();
	 	System.out.println("1���� 10������ �� : " + sum + "�Դϴ�.");

	 	
	}
}
	

