package Chapter03.WHILE;

import java.util.Scanner;

public class WhileTest_04 {

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Java 교과목 점수를 입력하세요 : ");
			int scr=scan.nextInt(); 
			
			//0미만이거나 또는 100초과면 while문 중지, 60점 이상이면 합격 그렇지 않으면 불합격
			
			if (scr<0 || scr>100) {
				break;
			}	
			else if (scr>=60) {
				System.out.println("합격");
								
			}else {
				System.out.println("불합격");
				
		
			} //if			
		} //while
		System.out.println("프로그램이 종료되었습니다.");
	
	
	
	}
}
