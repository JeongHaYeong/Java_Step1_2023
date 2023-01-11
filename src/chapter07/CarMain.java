package chapter07;

public class CarMain {

	public static void main(String[] args) {
		//생성자를 통하여 초기화
		Car car=new Car("하늘색",3000); //여기에서 초기화를 시킨다
		//멤버변수에 직접 접근해서 초기화 후 출력
		
		System.out.println("color : "+car.color);
		System.out.println("cc : "+car.cc);
		
		System.out.println("------------------------------------");
		
		System.out.println("color : "+car.getColor());
		System.out.println("cc : "+car.getCc());
		
		//메서드를 이용한 출력
	}

}
