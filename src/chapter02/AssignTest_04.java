package Chapter02;

public class AssignTest_04 {

	public static void main(String[] args) {
		//�������� Prefix
		System.out.println("==���� ����==");
		int gameScore=150; 
		
		int lastScore1=++gameScore; //1�� ������ �б� 151
		System.out.println(lastScore1); 
		int lastScore2=--gameScore; //1�� ���� �б� 150
		System.out.println(lastScore2);


		
		//�������� Postfix
		System.out.println("=���� ����==");
		int lastScore3=gameScore++; //�а� �� ���ϱ� 150 151
		System.out.println(lastScore3);
		System.out.println(gameScore);
		
		int lastScore4=gameScore--; //�а� �� ���ϱ� 151 150
		System.out.println(lastScore4);
		System.out.println(gameScore);
		
		
	}
}
