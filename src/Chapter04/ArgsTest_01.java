package Chapter04;

public class ArgsTest_01 {

	public static void main(String[] args) {
		//배열 Array
		
		
		//배열 선언하는 방법1
		int a[]=new int[5]; //Fixed-length
				
		//배열 선언하는 방법2
		int[] b;
		b=new int[5];

		int aVal;
		int bVal;
		int Total;
		
		args=new String[2];
		args[0]="1";
		args[1]="1";

		//length: 배열의 메모리 수
		if(args.length == 2) {	
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
		}else {
			aVal=0;
			bVal=0;
		}

		 Total = aVal + bVal;
		 System.out.println(Total);
		
		
	}
}
