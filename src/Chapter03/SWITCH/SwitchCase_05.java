package Chapter03.SWITCH;

public class SwitchCase_05 {

	public static void main(String[] args) {
		
//		System.out.println("�ֻ��� ���� : ");
		int num=(int)(Math.random()*10)+1;
		
//		switch(num) {
//		case 1:
//			System.out.println("1�� �Դϴ�.");
//			break;
//			
//		case 2:
//			System.out.println("2�� �Դϴ�.");
//			break;
//			
//		case 3:
//			System.out.println("3�� �Դϴ�.");
//			break;
//			
//		case 4:
//			System.out.println("5�� �Դϴ�.");
//			break;
//			
//		case 5:
//			System.out.println("6�� �Դϴ�.");
//			break;
//			
//		case 6:
//			System.out.println("5�� �Դϴ�.");
//			break;
//			
//		default :
//			System.out.println("�߸��� �� �Դϴ�.");
//		}
		
		switch(num) {
		case 1,2,3,4,5,6:
			System.out.println(num + "�� ȹ��");
			break;
		
		default:
			System.out.println("�߸� �� �����Դϴ�.");
		}
		System.out.println("�ֻ����� ���� ���� ���ڴ� " + num + "�Դϴ�.");
		
	}
	
}
