package chapter06;

public class Can {

	//필드
	private String canName;
	private int price;
	
	//생성자 오버로딩
	public Can(String canName,int price) {
		this.canName=canName;
		this.price=price;
	}

	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
}

//여러개 사용할 때 순서

//필드 
//오버로딩
//getter
//↓
//메서드
//문제 풀이
//↓
//보여주기 (프론트 앤드)