package Chapter04;

public class CharArrayTest_02 {

	public static void main(String[] args) {
		
		char[] alphabets=new char[26];
		char ch='A'; //65

		
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++;//ch=ch+1
			System.out.print("("+ alphabets[i] + ", " +(int)alphabets[i]+")" + "|");
		}
		
//		System.out.println(ch++);
//		System.out.println(ch);
		
		
		
	}
}
