package Chapter03.WHILE;

public class WhileTest_01 {

	public static void main(String[] args) {
	
		System.out.println("주사위 놀이 출력");
		
		while(true) {
			
			int num=(int)(Math.random()*6)+1;
			System.out.println("주사위 눈: " + num);
			
			if(num==6) {
				break;
			} // if
				
		}// while
		System.out.println("프로그램 종료");
		
		
		
	} // main
} //class
