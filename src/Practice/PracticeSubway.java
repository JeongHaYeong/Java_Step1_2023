package Practice;

public class PracticeSubway {
	int subwayNumber;
	int passengerCount;
	int money;
	
	public PracticeSubway(int subwayNumber) {
		this.subwayNumber=subwayNumber;
	}
	
	public void take(int money) {
		this.money=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("지하철 "+subwayNumber+"번의 승객은 "+passengerCount+"명 이고 수입은 "+money+"입니다.");
	}

}
