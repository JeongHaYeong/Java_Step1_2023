package Chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample_08 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
     	num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
     	
     	//num1�� ũ�� num1�� Ů�ϴ�.
     	//num2�� ũ�� num2�� Ů�ϴ�.
     	//�� ���� �����ϴ�.
     	
     	if (num1>num2) {
     		System.out.println(num1 + "��(��) Ů�ϴ�.");
     	}if (num1<num2) {
     		System.out.println(num2 + "��(��) Ů�ϴ�.");
     	}if (num1==num2) {
     		System.out.println("�� ���� �����ϴ�.");
     	}
     	
	}
}
