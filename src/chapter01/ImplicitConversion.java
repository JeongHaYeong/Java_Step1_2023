package chapter01;

public class ImplicitConversion {

	public static void main(String[] args) {
		//������ ����ȯ: �����޸𸮿��� ū�޸𸮷� �ڿ������� ����ȯ�� �̷����
		
		byte bNum=10; //8 bit
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		// ������ ����ȯ : �� ������ ���� �ڿ������� ����ȯ�� �̷����
		int iNum2=20;
		float fNum=iNum2;
		
		System.out.println("===========");
		System.out.println(iNum2);
		System.out.println(fNum);
				
		
	}
}
