package chapter05;

public class MethodMain {

	public static void main(String[] args) {
		
		//Method bread=new Method(); //class 가져오기;
		Method2 bread2=new Method2(); //class 가져오기; //bread라는 이름을 새로 만들어 주었다.
		
		//bread.makeBread();
		//System.out.println("---------------------------------");
		//bread.makeBread(5);
		//System.out.println("---------------------------------");
		//bread.makeBread(5,"생크림");
		bread2.order2();
	}
	//void일때는 main에서는 뽑아오기만 한다.	
	
}
