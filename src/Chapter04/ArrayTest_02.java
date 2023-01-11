package Chapter04;

import javax.swing.JOptionPane;

public class ArrayTest_02 {

	public static void main(String[] args) {
		
		String name[] = new String[7];
		String phone[] = new String[7];
//		int jumsu[]=new int[7];

		for(int i=0; i<name.length; i++) {		
		
		name[i] = JOptionPane.showInputDialog("이름");
		phone[i] = JOptionPane.showInputDialog("전화번호");
//		jumsu[i] = Integer.parseInt(JOptionPane.showInputDialog("전화번호"));
		
		System.out.println("이름: " + name[1] + "전화번호: "+ phone[i]);
//		System.out.println("이름: " + name[1] + "전화번호: "+ jumsu[i]);
		}
		
		
		
	}
}
