package Chapter02;

public class Example_03 {

	public static void main(String[] args) {
		
		int score1=60;
		// ���׿����ڸ� �̿��Ͽ� score1�� 60�� ���� ũ�ų� ������ �հ� �׷��� ������ ���հ�
		
		String S= (score1 >= 60) ? "�հ�" : "���հ�";
		
		// S= (score1 >= 60) ? "�հ�" : "���հ�";
			System.out.println(S);
		
		
		int score2=82;
		// ���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ� 
		
		char result= (score2 > 90) ? 'A' : ((score2 > 80) ? 'B' : 'C'); 
		
		//result = (score2 > 90) ? 'A' : ((score2 > 80) ? 'B' : 'C');
			System.out.println(result);

		
	}
}
