package Chapter04;

import javax.swing.JOptionPane;

public class ArrayTest_02 {

	public static void main(String[] args) {
		
		String name[] = new String[7];
		String phone[] = new String[7];
//		int jumsu[]=new int[7];

		for(int i=0; i<name.length; i++) {		
		
		name[i] = JOptionPane.showInputDialog("�̸�");
		phone[i] = JOptionPane.showInputDialog("��ȭ��ȣ");
//		jumsu[i] = Integer.parseInt(JOptionPane.showInputDialog("��ȭ��ȣ"));
		
		System.out.println("�̸�: " + name[1] + "��ȭ��ȣ: "+ phone[i]);
//		System.out.println("�̸�: " + name[1] + "��ȭ��ȣ: "+ jumsu[i]);
		}
		
		
		
	}
}
