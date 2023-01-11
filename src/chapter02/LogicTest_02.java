package Chapter02;

public class LogicTest_02 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		boolean flag=(num1>10) && (num2>20);
		System.out.println("false && false : " + flag); //false
		
		boolean flag2=(num1>10) && (num2>0);
		System.out.println("false && true : " + flag2); //false
		
		boolean flag3=(num1>0) && (num2>20);
		System.out.println("true && false : " + flag3); //false
		
		boolean flag4=(num1>0) && (num2>0);
		System.out.println("true && true : " + flag4); //true
	
		
		System.out.println("--------------OR--------------");

		boolean flag5=(num1>10) || (num2>20);
		System.out.println("false || false : " + flag5);
		
		boolean flag6=(num1>10) || (num2>0);
		System.out.println("false || true : " + flag6);
		
		boolean flag7=(num1>0) || (num2>20);
		System.out.println("true || false : " + flag7);
		
		boolean flag8=(num1>0) || (num2>0);
		System.out.println("true || true : " + flag8);
	
		
		System.out.println("--------------NOT--------------");
		
		//num1과 num2는 같지 않다. 
		boolean flag9=(num1 != num2); // 같지 않으면: T 같으면: F
		System.out.println(flag9);
		
		boolean flag10=!(num1<0); //관계연산의 회로
		System.out.println(flag10);
		

	}
}
