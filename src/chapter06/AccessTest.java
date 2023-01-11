package chapter06;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;	
	
	/*디폴트 생성자(생략 가능)
	public AccessTest() { //void //int double 등등 삽입해주면 안된다.
		// TODO Auto-generated constructor stub
	}
	*/

	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}
	
	public void setBb(int bb) {
		this.bb = bb;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa값 : "+aa+"\nbb값 : "+bb+"\ncc값 : "+cc);
	
	}
	
	
	public static void main(String[] args) {
		//객체 (obj)
		AccessTest obj=new AccessTest();
		
		Scanner scan=new
		Scanner(System.in);
		
		
		obj.aa=scan.nextInt();
		obj.bb=scan.nextInt();
		obj.cc=scan.nextInt();
				
				
		obj.Disp();
		
	}


}
