package Chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample_02 {

	public static void main(String[] args) {
		
		//String -> int : Integer.parseInt
		
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
		
		//10의 배수를 판단하세요
		// 조건 : dat를 10으로 나눈 나머지가 0이냐?
		
		if (dat % 10 == 0)
			System.out.println(dat + "(은)는 10의 배수입니다.");
		else
			System.out.println(dat + "(은)는10의 배수가 아닙니다.");
		
		
	}
}
