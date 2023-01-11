package Chapter02;

public class Condition_02 {

	public static void main(String[] args) {

		int fatherAge=47;
		int motherAge=45;
		
		char ch; // ''로 한글자만 혹은 String으로 "" 한글자 이상 사용 시 
		  
		//ch= (fatherAge > motherAge) ? 'T' : 'F';
		ch= (fatherAge > motherAge) ? 'T' : ((fatherAge == motherAge) ? 'E':'F');
		
			System.out.println(ch);
 		
		
		
	}
}
