package Chapter02;

public class Condition_02 {

	public static void main(String[] args) {

		int fatherAge=47;
		int motherAge=45;
		
		char ch; // ''�� �ѱ��ڸ� Ȥ�� String���� "" �ѱ��� �̻� ��� �� 
		  
		//ch= (fatherAge > motherAge) ? 'T' : 'F';
		ch= (fatherAge > motherAge) ? 'T' : ((fatherAge == motherAge) ? 'E':'F');
		
			System.out.println(ch);
 		
		
		
	}
}
