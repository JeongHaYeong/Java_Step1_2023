package chapter05;

public abstract class TryCatchThrows {
	
	public static void fun() throws Exception { // throws=던져주다(옮기다)

		try { // 정상코드
			System.out.println("fun()메서드");
			throw new Exception();
		} catch (RuntimeException e) { // 에러시 수행하는 수행문 Exception e //RunTimeEception : 실행중에 발생하는 에러
			// 에러시 수행하는 수행문
			System.out.println("예외발생"); // 안내
		} finally { // 에러를 잡지 못해도 또는 에러를 잡아도 무조껀 수행해야하는 코드
			System.out.println("finally 문장");
		}

	}// fun

	public static void main(String[] args) {
		// static이므로 바로 호출가능 가능해야하지만 throws Exception 메소드 이므로 try catch로 호출
		// fun();

		try {
			fun();
		} catch (Exception e) {
			System.out.println("main의 catch문 문장");
		}

	}

}
