package chapter06;

public class Computer {

	int sum1(int values[]) {
		int sum=0;
		
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		
		return sum;
	}

//============================================================	
		
	
	int sum2(int... values) {//...{}하지않아도 가능하다.
		int sum=0;
		
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		
		return sum;
	}
	
		
}//class