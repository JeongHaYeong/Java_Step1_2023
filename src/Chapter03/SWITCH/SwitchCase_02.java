package Chapter03.SWITCH;

import javax.swing.JOptionPane;

public class SwitchCase_02 {

	public static void main(String[] args) {
		
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("번호를 입력하세요(1-4)"));
		
		switch (num) {
		case 1: {
			
			System.out.println("예금조회를 선택하셨습니다.");
			break;
		}
		case 2: {
			
			System.out.println("출금을 선택하셨습니다.");
			break;
		}
		case 3: {
			
			System.out.println("입금을 선택하셨습니다.");
			break;
		}	
		case 4: {
			
			System.out.println("송금을 선택하셨습니다.");
			break;
		}
		default:
			System.out.println("번호를 잘못 입력하셨습니다.");
		}
	}
}
