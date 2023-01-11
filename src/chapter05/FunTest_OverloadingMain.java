package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		FunTest_Overloading i=new FunTest_Overloading(); //class를 가져온다.
		
		i.getReult(3);
		i.getReult("정하영");
		i.getReult('Y');
		i.getReult(6," 2023");
		
		//객체지향 프로그램: 실체와 실체 사이에 일어나는일을 프로그램으로 구현하는 것
		
	}//main

}//class
