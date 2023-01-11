package Chapter01;

public class BinaryTest {

	//변수명-카멜: 맨앞에는 소문자이고 단어의 첫자는 대문자(중간단어)
	//변수명-파스칼: 첫글자는 무조건 대문자	
	public static void main(String[] args) {
		
		int num=10;
		int bNum=0B1000; //2진수(0B)
		int oNum=010; //8진수(OCT)	
		
		int bNum2=0B10000; //2진수(0B)
		int hNum=0X10; //16진수(HEX)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		System.out.println(bNum2);
		
		
		
	}
	
}
