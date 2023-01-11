package Chapter03.SWITCH;

public class SwitchCase_06 {

	public static void main(String[] args) {
		//random 9-18
		
		int t=(int)(Math.random()*10)+9;
		System.out.println("현재시간 " + t + "시");
	
		switch(t) {
		case 9: 
			System.out.println("QR 찍기");
			break;
			
		case 10,11,12: 
			System.out.println("수업듣기");
			break;
			
		case 13: 
			System.out.println("점심먹기");
			break;
			
		case 14,15: 
			System.out.println("복습하기");
			break;
		
		case 16,17,18: 
			System.out.println("코딩연습하기");
			break;		
			
		}
		
		
	}
}
