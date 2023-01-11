package chapter05;

import java.util.Scanner;

public class Method {

	//멤버변수(=필드)
	Scanner scan=new Scanner(System.in);	
	//생성자 생략
	
	//메서드
	
	
	void makeBread() {
			System.out.println("빵을 만듭니다.");	 
	}//method1
	void makeBread(int count) {
	//1번째 빵을 만들었습니다.
	//2번쨰 빵을 만들었습니다.
    //......
	//요청하신 5개의 생크림빵이 모두 완료되었습니다.
	}
	void makeBread(int count,String str) {
		for(int i=0;i<count;i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다.");
			
		}
		System.out.println("요청하신 "+count+"개의 "+str+"빵이 모두 완료되었습니다.");
	}//method3
	
	void order() {
		
		int num=0;
		int x,c;
		
		boolean run=true;
		
		while(run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 |3. 종료 : ");
			System.out.print("선택> ");
			int num1=scan.nextInt();
			switch (num1) {
			case 1:
				System.out.print("주문할 빵의 갯수 : ");
				x=scan.nextInt();                       //작성해야하는 구문에는 항상 들어가는 형태의 코드
				for(int i=0;i<x;i++)	{				
				System.out.println((i+1)+"번째 빵을 만들었습니다.");
				}
				System.out.println("요청하신 "+x+"개의 빵이 모두 완료되었습니다.");
				break;
			case 2:
				System.out.print("주문할 빵의 갯수 : "); 
				c=scan.nextInt();                       //작성해야하는 구문에는 항상 들어가는 형태의 코드
				System.out.print("주문할 빵의 종류 : ");
				String str=scan.next();                 //작성해야하는 구문에는 항상 들어가는 형태의 코드
				for(int j=0;j<c;j++)		{			
					System.out.println((j+1)+"번째 "+str+"빵을 만들었습니다.");
				}
				System.out.println("요청하신 "+c+"개의 "+str+"빵이 모두 완료되었습니다.");
					break;
			case 3:
				run=false;
		
			}
		}//while
		System.out.println("프로그램 종료");
	}
	
}//class
