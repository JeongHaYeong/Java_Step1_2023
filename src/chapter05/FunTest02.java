package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {
	

	
		//(함수equal.메서드)
		//접근한정자 : public(공용으로 사용) / protected(패키지내에서 공용됨) / private(class안에서만 사용)
		//void : return 없음
		public void sum(int num1,int num2) {
			//int num1=3;
			//int num2=5;
			int total=num1+num2;
			System.out.println(num1+"+"+num2+total);//여기까지의 공식이 아래 void에 들어가있다.
			
			
		}
		
		//실행담당 메소드
		public static void main(String[] args) {
			int a,b;
			a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
			b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
			//staric에서 호출되지 않았으므로 Error발생
			
			
			FunTest02 obj=new FunTest02();
			obj.sum(a,b);
			
	}//main
		/*
		//메인을 기준으로 하며 메인선언 전 또는 후에 정의해도 됨
		public static void sum(int num1,int num2) {
			//int num1=3;
			//int num2=5;
			int total=num1+num2;
			System.out.println(total);//여기까지의 공식이 아래 void에 들어가있다.
			*/
		

}//class
