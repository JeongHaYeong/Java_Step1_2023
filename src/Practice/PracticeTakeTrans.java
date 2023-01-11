package Practice;

import chapter06.Bus;
import chapter06.Subway;

public class PracticeTakeTrans {

	public static void main(String[] args) {
		PracticeStudent studentJames=new PracticeStudent("James",5000);
		PracticeStudent studentTom=new PracticeStudent("Tom",10000);
		
		PracticeBus bus100=new PracticeBus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		PracticeSubway subwayGreen=new PracticeSubway(2);
		studentTom.takeSubway(subwayGreen);
		studentTom.showInfo();
		subwayGreen.showInfo();
		

	}

}
