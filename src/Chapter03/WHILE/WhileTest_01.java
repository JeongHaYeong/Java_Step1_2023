package Chapter03.WHILE;

public class WhileTest_01 {

	public static void main(String[] args) {
	
		System.out.println("�ֻ��� ���� ���");
		
		while(true) {
			
			int num=(int)(Math.random()*6)+1;
			System.out.println("�ֻ��� ��: " + num);
			
			if(num==6) {
				break;
			} // if
				
		}// while
		System.out.println("���α׷� ����");
		
		
		
	} // main
} //class
