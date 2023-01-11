package Chapter03.IF;

public class ifExample_06 {
	
	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;  //default는 0부터 시작
		// double num1=Math.random()*6;
		
		//1점 - 6점 까지 받을 수 잇는 각 점수당 이벤트를 출력
		
		System.out.println(num);
		//#1
		/*
		if (num==1)
			System.out.println("집에 가기");
		 
		if (num==2)
			System.out.println("간식 먹기");
		
		if (num==3)
			System.out.println("물마시기");
		
		if (num==4)
			System.out.println("낮잠자기");
		
		if (num==5)
			System.out.println("밥 먹기");

		if (num==6)
			System.out.println("커피 마시기");
		*/
		
		//#2
		if (num==1)
			System.out.println("집에 가기");
		 
		else if (num==2)
			System.out.println("간식 먹기");
		
		else if (num==3)
			System.out.println("물마시기");
		
		else if (num==4)
			System.out.println("낮잠자기");
		
		else if (num==5)
			System.out.println("밥 먹기");

		else 
			System.out.println("커피 마시기");
	
		
		
	}

}
