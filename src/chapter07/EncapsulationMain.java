package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		
		//객체생성
		Encapsulation a=new Encapsulation();
		
		//Encapsulation의 메서드를 사용하여 사각형의 넓이를 구하기
		Area=a.Cal_Area(side,height);
		
		System.out.println("사각형의 넓이 : "+Area+"입니다.");
		String str=("사각형의 넓이 : "+Area+"입니다.");
		JOptionPane.showMessageDialog(null, str);
	}

}
