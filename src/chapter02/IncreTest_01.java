package Chapter02;

public class IncreTest_01 {

	public static void main(String[] args) {
		
		int a, b, c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : " + (++a)); //a=a+1 �Ǵ� a+=1
		System.out.println("++a : " + (a++)); //11 
		System.out.println("������� : " + (a++)); //12 
		System.out.println("========================");
		System.out.println("c++ : " + (c++)); //3
		System.out.println("c++ : " + (c++)); //4
		
		System.out.println("========================");
		//a Prefix + b Postfix
		// #1
		System.out.println("++a + b++ : " +(++a + b++)); // 14 + 20 
		System.out.println("������� : " +  b); //21
		
		
		System.out.println("========================");	
		
		//#2
		//a Prefix
		System.out.println("a ������� : " + (++a)); //15
		//b Postfix
		System.out.println("b ������� : " + (b++)); //21 
		//a Prefix + b Postfix
		System.out.println("a ������� + b ������� : " + (++a + b++)); // 16 + 22
		
	
	}
}
