package Chapter03.FOR;

import java.util.Scanner;

public class ForTest_09 {

	public static void main(String[] args) {
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է¹޾� ������ ����� ���Ͻÿ�(��, ����� �Ǽ��� ����Ѵ�)
		 
		Scanner scan=new Scanner(System.in);
		
		int i, sum=0, average=0, score, cnt=0;

		System.out.println("����� �л� ������ �Է� �����ðھ��? :"); 
		int student=scan.nextInt(); //5
		
		for(i=1; i<=student; i++) {
			System.out.println(i + "��° �л��� ������ �Է��ϼ���: ");
			score=scan.nextInt();
			sum +=score;
			cnt++;
		}
		
		average = sum / cnt;
		System.out.println("���� : " + sum + ", ��� :" + (double)average);
		
	}
}
