package chapter05;

public class FunTest06 {

	public String channel;
	public int channelInt;
	public int 	volume;
	public int volume1;
	
	//생성자 생략
	
	//void외에 모든 타입의 메소드는 반드시 꼭 return값을 갖는다.
	
	
	public int channelUp (int volume) {//void가 아닐때는 반드시 return을 사용해야한다.
		this.volume=volume;
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
	}
	
		public void channelDown (int volume) {//void가 아닐때는 반드시 return을 사용해야한다.
			this.volume=volume;
			System.out.println("소리를 "+volume+"만큼 내리겠습니다.");
			//void는 절대 return 값이 성립할수 없다.
			  				
	}
	
	
	
	public static void main(String[] args) {
		
		FunTest06 tv=new FunTest06();
		
		//방법1
		//System.out.println("소리를 "+tv.channelUp(9)+"만큼 올립니다.");
		//방법2
		
		int volume=tv.channelUp(9);
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		
		 
		tv.channelDown(5);
	
		
		
	}

}
