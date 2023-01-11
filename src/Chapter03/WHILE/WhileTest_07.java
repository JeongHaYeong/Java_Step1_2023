package Chapter03.WHILE;

import java.util.Scanner;

public class WhileTest_07 {

	public static void main(String[] args) {
		//1.입력하기
		//2.출력하기
		//3.삭제하기
		//4.끝내기
		//그외 : 작업할 번호를 선택하세요.
		
		String menu=" ";
		
		//do는 무조건 끝까지 수행을 해야함

		Scanner scn = new Scanner(System.in);
		int num;
		

		do
		{
			System.out.println("1.입력하기");
			System.out.println("2.출력하기");
			System.out.println("3.삭제하기");
			System.out.println("4.끝내기");
			System.out.print("작업할 번호를 선택하세요.: ");
			num = scn.nextInt();
			
			
			
			//예외처리
			if(num < 1 || num > 3) //
			{
				if( num == 4)
				{
					break;
				}
				menu = "잘못";
			}
			else
			{
				if(num == 1)
				{
					menu = "입력하기를";
				}
				else if(num == 2)
				{
					menu = "출력하기를";
				}
				else if(num == 3)
				{
					menu = "삭제하기를";
				}
			}
			System.out.printf("\n%s 선택하였습니다.\n\n", menu);

		}while(num != 4);
	
		System.out.print("\n끝내기를 선택하였습니다.");
	
		
	}
}
	
			
			
			
			
//		if(a == 1) {
//				System.out.println("입력하기를 선택하였습니다.");
//				break;
//				
//		}else if(a == 2) {
//				System.out.println("출력하기를 선택하였습니다.");
//				break;
//				
//		}else if(a == 3) {
//				System.out.println("삭제하기를 선택하였습니다.");
//				break;
//				
//		}else if(a == 4) {
//				System.out.println("삭제하기를 선택하였습니다.");
//				break;
//				
//		}else {
//				System.out.println("잘못 선택하였습니다.");
//				
//		} System.out.println();
//		}while(true);
//		

	
