package Chapter03.FOR;

public class ForTest_11 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=1; i<=7; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j + " ");
			}//안의 for문
			System.out.println();
		}// 밖의 for문
		
		
		
	}
}
