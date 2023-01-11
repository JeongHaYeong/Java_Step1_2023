package Practice;

public class PracticeBus {
	//버스 클래스 구하기
		int busNumber;
		int passengerCount;
		int money;
		
		public PracticeBus(int busNumber) {
			this.busNumber=busNumber;
		}
		
		public void take(int money) {
			this.money=money;
			passengerCount++;
		}
		public void showInfo() {
			System.out.println("버스 "+busNumber+"의 승객은 "+passengerCount+"명 이고 수입은 "+money+"입니다.");
		}
		
}
