package Chapter03.FOR;

public class ForTest_02 {

	public static void main(String[] args) {
		
		int i;
		
		System.out.println("1���� 100������ �� ���");
		for(i=1; i <=100; i++) {
			System.out.println(i + " ");
		}
		
		System.out.println("======================");
		
		int s;
		int sum=0;
		
		for(s=1; s<=100; s++) {
			System.out.println(s + " ");
			sum += s;
		}
		
		System.out.println();
		System.out.println("1���� 100������ �� : " + sum + "�Դϴ�." );
	
	
	}
}
