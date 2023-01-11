package Chapter03.SWITCH;

public class SwitchCase_01 {

	public static void main(String[] args) {
	 
		int ranking=2;
		char medalColour; 
		
		switch(ranking) {
		case 1: medalColour='G';
				break;
		case 2: medalColour='S';
				break;
		case 3: medalColour='B';
				break;
		default :
			medalColour='A';
		}
		System.out.println(ranking + "등 메달은" + medalColour + "입니다.");
		
		
	}
}
