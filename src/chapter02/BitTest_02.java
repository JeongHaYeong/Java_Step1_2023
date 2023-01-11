package Chapter02;

public class BitTest_02 {

	public static void main(String[] args) {
		
		int num=0B00000101; //5
		System.out.println(num);
		
		//shift 연산
		System.out.println(num<<2); //증가
		System.out.println(num>>2); //감소
		
		int a, b, c;
		a=5;
		b=2;
		c=a>>b;
		System.out.println(c); // 00000101 -> 00000001 so, 1 = 1
	
		c=a<<b;
		System.out.println(c); // 00000101 -> 00010100 so, 4 + 16 = 20
		
		
		
		
	}
}
