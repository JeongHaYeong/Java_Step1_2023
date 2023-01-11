package Chapter03.EXAMPLE;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		//정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요. (입력은 Scanner class 사용)
		//소프트웨어 설계(soft1), 소프트웨어 개발(soft2), 데이터베이스 구축(DB), 프로그래밍언어활용(pro), 정보시스템 구축(os)
		//한 과목이라도 8개 미만, 평균이 60점 미만인 경우 (OR ||) 경우 불합격입니다. 로 출력
		// 그렇지 않으면 합격입니다.로 출력
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("소프트웨어 설계 점수 : ");
		//int soft1=Integer.parseInt(scan.nextLine());
		int soft1=scan.nextInt();	
		
		System.out.println("소프트웨어 개발 점수 : ");
		//int soft2=Integer.parseInt(scan.nextLine());
		int soft2=scan.nextInt();
		
		System.out.println("데이터베이스 구축 점수 : ");
		//int DB=Integer.parseInt(scan.nextLine());
		int DB=scan.nextInt();
		
		System.out.println("프로그래밍언어 활용 점수 : ");
		//int pro=Integer.parseInt(scan.nextLine());
		int pro=scan.nextInt();
		
		System.out.println("정보시스템 구축 점수 : ");
		//int os=Integer.parseInt(scan.nextLine());
		int os=scan.nextInt();
		
		int total = soft1+soft2+DB+pro+os;
		float average =(total)/5f;
		
		if (soft1 < 8 || soft2 < 8 || DB < 8 || pro < 8 || os < 8 || average <60)
				System.out.println("불합격입니다.");
		
		else
				System.out.println("합격입니다.");
		
		

		
	}
}
