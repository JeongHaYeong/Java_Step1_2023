package Chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample_05 {

	public static void main(String[] args) {
		// 전시관의 입장료는 미취학 아동은 1000원
		// 전시관의 입장료는 초등학생은 2000원
		// 전시관의 입장료는 중.고등학생은 3500원
		// 전시관의 입장료는 성인은 5000원
		
		int age;
		//나이를 입력하세요.
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요.")); 
				
		int charge=0;
	
		if(age>=0 && age<8) {
			charge=1000;
			System.out.println("미 취학 아동 입니다.");
		}	
		if(age>=8 && age<14) {
			charge=2000;
			System.out.println("초등학생 입니다.");
		}
		if(age>=14 && age<20) {
			charge=3500;
			System.out.println("중.고등학생 입니다.");
		}		
							
		System.out.println("입장료는 " + charge + "원 입니다.");
			
				
	} //main
} //class
