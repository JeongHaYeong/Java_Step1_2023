package Chapter03.SWITCH;

public class SwitchCase_06 {

	public static void main(String[] args) {
		//random 9-18
		
		int t=(int)(Math.random()*10)+9;
		System.out.println("����ð� " + t + "��");
	
		switch(t) {
		case 9: 
			System.out.println("QR ���");
			break;
			
		case 10,11,12: 
			System.out.println("�������");
			break;
			
		case 13: 
			System.out.println("���ɸԱ�");
			break;
			
		case 14,15: 
			System.out.println("�����ϱ�");
			break;
		
		case 16,17,18: 
			System.out.println("�ڵ������ϱ�");
			break;		
			
		}
		
		
	}
}
