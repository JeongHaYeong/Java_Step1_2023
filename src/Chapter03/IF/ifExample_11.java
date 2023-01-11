package Chapter03.IF;

import java.util.Scanner;

public class ifExample_11 {

	
	public static void main(String[] args) {
		//Scanner scan이라는 인스턴스 변수방을 선언
		Scanner scan=new Scanner(System.in);
		
		//ID라는 변수방에 (String)
		System.out.print("아이디 : ");
		String ID= scan.nextLine();
		
		//PW라는 변수방에 비밀번호 받기 (String)
		System.out.print("비밀번호 : ");
		String PW= scan.nextLine();
		
		//비밀번호만 형변환
		int pass=Integer.parseInt(PW);
		//pw=scan.nextInt();
								
		//중첩if문을 사용하여 로그인 성공, 비밀번호 다름, 아이디 없음
		
		if(ID.equals("soldesk") && pass == 20220617) {
				System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
				
//		if(ID.equals("soldesk")) {
//			if(pass == 20220617) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호 다름");
//			}
//		}else {
//			System.out.println("아이디 없음");
//		}	
		
		
	}
}
