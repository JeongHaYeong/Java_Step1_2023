package chapter01;

public class ExplicitConversion {

	public static void main(String[] args) {
		//����� ����ȯ: ĳ���ù���
		
		
		//byte bNum=100; //bNum�� 100���� ��������� ������ iNum�� ����Ʈ �� �� ����
 		//int iNum=bNum;
		
 		//int iNum=1000; //Error Code: connot convert from int to byte
 		//byte bNum=iNum;
 		
 		int iNum=1000;
 		byte bNum=(byte)iNum;
 		
		System.out.println(iNum);
		System.out.println(bNum);  //���ǵ�(�ս�)
		
		double dNum1=1.2; //8byte -> 4byte
		float fNum1=0.9f; //4byte
		
		int iNum2=(int)(dNum1+fNum1);
		int iNum3=(int)dNum1+(int)fNum1;
		
		System.out.println(iNum2);  //2.1������ int�� ����� 2
		System.out.println(iNum3);  //1.2-> 1 + 0.9 -> 0 so, 1
		
		
		
	}
}
