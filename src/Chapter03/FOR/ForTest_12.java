package Chapter03.FOR;

public class ForTest_12 {

	public static void main(String[] args) {
		
		int x, y;
		
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) { //x=1 y=1,2,3,4,5,6,7,8,9,10 | x=2 y=1,2,3,4,5,6,7,8,9,10 | x=3 y=.....)
				if(4*x + 5*y == 60) {
					System.out.println(x + "," + y);
			} // if
		}// in for
	} //out for
		
	}
}
