package Chapter03.FOR;

public class ForTest_03 {

	public static void main(String[] args) {
		//1���� 100������ ���� ���ϵ� ���� 100�����̸鼭 ���� ����� ��
	
//		//#1
//		int s;
//		int sum=0;
//		
//		for(s=1; s<=100; s++) {
//			sum += s;
//			if (sum<100) 
//			System.out.println("���� " + s + "������ �� : " + sum + "�Դϴ�." );

		//#2
		int s;
		int sum=0;
			
		for(s=1; s<=100; s++) {
			sum += s;
			if (sum>= 100)
			break;				
		}
	
		System.out.println("�ش� ���� : " + (s-1) + "�Դϴ�." );
		System.out.println("���� " + (s-1) + "������ �� : " + (sum-s) + "�Դϴ�." );

		
		
//		//#3
//		System.out.println("1���� 100������ ���� ���ϵ� ���� 100�� �ʰ��ϴ� ù��° ���� ��");
//		int s;
//		int sum=0;
//		for(s=1; sum<100; s++) {
//			System.out.println("���� " + (s-1) + "������ �� : " + (sum-s) + "�Դϴ�." );
//			sum += s;
//		}
					
	
	}
}
