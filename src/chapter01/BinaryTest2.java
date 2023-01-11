package chapter01;

public class BinaryTest2 {

	//ī�� :
	public static void main(String[] args) {
		//int : ����(4����Ʈ)
		//0 => ��� �� 1 -> ����
		
		int num1=0B00000000000000000000000000000101;
		int num2=0B11111111111111111111111111111010; //�ڵ������ �ƴ����� 1�� �����δ� ��Ȯ�� ǥ���� �ȵ�-> 2�� ���� (�� + -> -)
		int num3=0B11111111111111111111111111111011; //1�� ������ ������ �ڸ��� 1�� ���� -> 2�� ���� (�� + -> -)
				
		System.out.println(num1); //5
     	System.out.println(num2); //-6
		System.out.println(num3); //-5
		
	}
}
