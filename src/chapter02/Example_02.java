package Chapter02;

public class Example_02 {

	public static void main(String[] args) {
		// ���� ���̸� ���Ͻÿ� (������*������*3.14)
		//������ : 10, 3.14�� double�� �����Ͽ� ���Ͻÿ�. 
		
		//#1
		int num1 = 10;
		double PI = 3.14;
		double result = num1 * num1 * PI;
		
		//#2
		//int num1=10;
		//int num2=3;
		//int num3=14;
						
		// double�� �� ������ �ڷ�Ÿ������ int�� ������ ����ȯ
		
		// int�� double�� ��ȯ: Double.parseDouble
		// string -> int : Integer.parseInt
		
		//double result=num1*num1* Double.parseDouble(num2 + "." +num3);
	
		System.out.println("���� ���̴� : " + result);
	
		
		
	}
}
