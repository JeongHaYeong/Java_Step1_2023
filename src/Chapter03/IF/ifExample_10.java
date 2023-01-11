package Chapter03.IF;

public class ifExample_10 {


	public static void main(String[] args) {

		String ID="soldesk"; //인스턴스 변수방
		//클래스
		int PW=20220614; //정수형 변수방
		//자료형

		
		if(ID.equals("soldesk")) {
			if(PW==2022) {
				System.out.println(ID+"님 환영합니다.");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
			
	}
}
