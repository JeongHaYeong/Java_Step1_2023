package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_09 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받아 총점과 평균을 구하시오(단, 평균은 실수로 출력한다)
		 
		Scanner scan=new Scanner(System.in);
		
		int i, sum=0, average=0, score, cnt=0;

		System.out.println("몇명의 학생 점수를 입력 받으시겠어요? :"); 
		int student=scan.nextInt(); //5
		
		for(i=1; i<=student; i++) {
			System.out.println(i + "번째 학생의 점수를 입력하세요: ");
			score=scan.nextInt();
			sum +=score;
			cnt++;
		}
		
		average = sum / cnt;
		System.out.println("총점 : " + sum + ", 평균 :" + (double)average);
		
	}
}
