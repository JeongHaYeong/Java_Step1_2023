package Chapter04;

public class ArraySumTest_01 {

	public static void main(String[] args) {
		
		int score[]= {85,90,87};
		int sum=0;
		
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+ i + "]: " + score[i]);
			sum += score[i];
		}
		
		System.out.println("���� : " + sum);
		double avg=(double)sum/score.length;
		System.out.println(String.format("��� : %.2f", avg));
		System.out.println(String.format("���(�ݿø�) : "+ Math.round(avg)));
		
		
	}
}
