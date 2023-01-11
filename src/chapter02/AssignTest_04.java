package Chapter02;

public class AssignTest_04 {

	public static void main(String[] args) {
		//전위연산 Prefix
		System.out.println("==전위 연산==");
		int gameScore=150; 
		
		int lastScore1=++gameScore; //1을 더한후 읽기 151
		System.out.println(lastScore1); 
		int lastScore2=--gameScore; //1을 뺀후 읽기 150
		System.out.println(lastScore2);


		
		//후위연산 Postfix
		System.out.println("=후휘 연산==");
		int lastScore3=gameScore++; //읽고난 후 더하기 150 151
		System.out.println(lastScore3);
		System.out.println(gameScore);
		
		int lastScore4=gameScore--; //읽고난 후 더하기 151 150
		System.out.println(lastScore4);
		System.out.println(gameScore);
		
		
	}
}
