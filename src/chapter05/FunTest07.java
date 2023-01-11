package chapter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {
		// TODO Auto-generated method stub
	}
	/*
	public static String Edustep(int edu) {
		String step;
		
		if(edu==1) {
			step="1단계";
		}else if (edu==2) {
			step="2단계";
		}else if(edu==3) {
			step="3단계";
		}else {
			step="해당하는 스터디단계가 없습니다.";
		}
		return step;
	}*/
	public static void Edustep(int edu) {
		String step;
		
		if(edu==1) {
			step="1단계";
		}else if (edu==2) {
			step="2단계";
		}else if(edu==3) {
			step="3단계";
		}else {
			step="해당하는 스터디단계가 없습니다.";
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("스터디 단계를 입력하세요 : ");
		int number=scan.nextInt();
		//return 값이 있는 경우
		
		
		Edustep(number);
		System.out.println("현재 수업 단계는 : "+number+" 입니다.");
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("스터디 단계를 입력하세요 : ");
		int number=scan.nextInt();
		//return 값이 있는 경우
		
		String step=Edustep(number);
		System.out.println("현재 수업 단계는 : "+step+" 입니다.");
		*/
	}//main

}
