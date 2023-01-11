package Chapter04;

public class ArrayTest_04 {
 
	public static void main(String[] args) {
		
		
		double a[]= {10,20,30};

		double total=0;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
			total += a[i];
		}
			System.out.println("Total = " + total);
			
		
			
		
	}
}


