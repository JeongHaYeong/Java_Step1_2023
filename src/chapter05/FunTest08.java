package chapter05;

public class FunTest08 {
	
	//멤버변수(필드)
	
	//디폴트 생성자
	
	//메서드 : 재귀함수
	public static int Recur(int a) {
		
		int result;
		System.out.print(a+" "); //5
		
		if(a==1){
			return(1);
		}else {
			result=a*Recur(a-1);
		}
		
		//return (1); //정상종료는 아니지만 오류없이 종료
		return result; //result로 넘기겠습니다.
	}

	public static void main(String[] args) {
		
		int x=5;				
		System.out.println("메서드 호출");
		int res=Recur(5);                                           //Recur
		System.out.println("1~ "+x+"까지의 tn를 곱한 값"+res);
		
	}

}
