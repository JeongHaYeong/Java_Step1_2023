package Chapter03.WHILE;

public class WhileTest_02 {

	public static void main(String[] args) {
		
//		int i=1;
//		
//		while(i<=10) {
//			
//			System.out.println(i);
//			i++; //i=i+1  =  i+=1  = i++ 
//		}
//		System.out.println(i);
		
		
		int num=1;
		int sum=0;
		
		while(num<=10) {
			sum+=num; //sum=sum+num
			num++; //num=num+1
		}
		System.out.println("현재의 num 값 : " + num);
		System.out.println("1-10까지의 합 : " + sum);
		
	}
}
