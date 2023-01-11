package chapter01;

public class LongVariable {

	public static void main(String[] args) {
	
		//int num1=12345678900;  int=32bit = 4byte
		long num2=12345678900L;
		long num3=1000; // long ���� 64��Ʈ������ L�� Long ������ ���������� int�� �ν�
		
		int level; //���������� ����
		    level=10; // level�̶�� �����濡 ���ͷ��� 10�� ����
		    		    
		System.out.println(num2+num3); //����� long
		System.out.println(level);
		
		
	}
	
}
