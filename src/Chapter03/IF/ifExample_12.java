package Chapter03.IF;

import java.util.Scanner;

public class ifExample_12 {

	public static void main(String[] args) {
		
		//데이터베이스(오라클)
		String ID = "soldesk";
		int PW = 2589;
		
		//Scanner sccan이라는 인스턴스 변수방을 선언
		Scanner scan = new Scanner(System.in);

		
		// ID라는 변수방에 아이디 받기(String)
		// PW라는 변수방에 비밀번호 받기 (String)
		System.out.print("아이디 : ");
		String InputID = scan.nextLine();
		if(ID.equals(InputID))
		{
			System.out.print("비밀번호 : ");
			String InputPW = scan.nextLine();
			if(PW == Integer.parseInt(InputPW))
			{
				System.out.println("로그인에 성공하셨습니다.");
			}
			else
			{
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else
		{
			System.out.println("아이디가 틀렸습니다.");
		}
	}
}
