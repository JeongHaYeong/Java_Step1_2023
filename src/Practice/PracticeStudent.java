package Practice;

import chapter06.Bus;
import chapter06.Subway;

public class PracticeStudent {

	public String studentName;
	public int grade;
	public int money;
	
	public PracticeStudent(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	public void takeBus(PracticeBus bus) {
		bus.take(1500);
		this.money-=1500;
	}
		public void takeSubway(PracticeSubway subway) {
			subway.take(1200);
			this.money-=1200;
	}
		public void showInfo() {
			System.out.println(studentName+"님의 남은 돈은 "+money+"입니다.");
		}
	
	
}
