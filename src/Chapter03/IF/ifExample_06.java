package Chapter03.IF;

public class ifExample_06 {
	
	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;  //default�� 0���� ����
		// double num1=Math.random()*6;
		
		//1�� - 6�� ���� ���� �� �մ� �� ������ �̺�Ʈ�� ���
		
		System.out.println(num);
		//#1
		/*
		if (num==1)
			System.out.println("���� ����");
		 
		if (num==2)
			System.out.println("���� �Ա�");
		
		if (num==3)
			System.out.println("�����ñ�");
		
		if (num==4)
			System.out.println("�����ڱ�");
		
		if (num==5)
			System.out.println("�� �Ա�");

		if (num==6)
			System.out.println("Ŀ�� ���ñ�");
		*/
		
		//#2
		if (num==1)
			System.out.println("���� ����");
		 
		else if (num==2)
			System.out.println("���� �Ա�");
		
		else if (num==3)
			System.out.println("�����ñ�");
		
		else if (num==4)
			System.out.println("�����ڱ�");
		
		else if (num==5)
			System.out.println("�� �Ա�");

		else 
			System.out.println("Ŀ�� ���ñ�");
	
		
		
	}

}
