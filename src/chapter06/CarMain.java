package chapter06;

import java.util.Scanner;


public class CarMain {

	public static void main(String[] args) {
		
		Car HeanDea=new Car();
		
		System.out.println("제작회사 : "+HeanDea.company);
		System.out.println("모델명 : "+HeanDea.model);
		System.out.println("색깔 : "+HeanDea.color);
		System.out.println("최고속도 : "+HeanDea.maxSpeed);
		System.out.println("현재속도 : "+HeanDea.speed);
		System.out.println("------------------------------");
		
		//방법1
		System.out.println("변경된 현재속도 : 60");
		
		//방법2
		HeanDea.speed=60;
		System.out.println("변경된 현재속도 : "+HeanDea.speed);

	}

}
