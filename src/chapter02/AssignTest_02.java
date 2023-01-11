package Chapter02;

public class AssignTest_02 {

	public static void main(String[] args) {
		
		int aVar=20;
		
		//독립적으로 변수방 활용
		System.out.println("aVar= aVar + 10 : " + (aVar= aVar + 10)); //aVar = 20 + 10 = 30
		System.out.println("aVar= aVar - 10 : " + (aVar= aVar - 10)); //aVar = 30 - 10 = 20

		
		System.out.println("aVar = aVar - 10 : " + (aVar-10)); //aVar = 20 - 10 = 10
		System.out.println("aVar = aVar * 10 : " + (aVar*10)); //aVar = 20 * 10 = 200 
				
		//누적값
		System.out.println("aVar+=10 : " + (aVar+=10)); //aVar = 20 + 10 = 30
		System.out.println("aVar-=10 : " + (aVar-=10)); //aVar = 30 - 10 = 20
		System.out.println("aVar*=10 : " + (aVar*=10)); //aVar = 20 * 10 = 200
		System.out.println("aVar/=10 : " + (aVar/=10)); //aVar = 200 / 10 = 20
		System.out.println("aVar%=10 : " + (aVar%=10)); // 20/10의 나머지값
		
				
		
		
		
	}
	
}
