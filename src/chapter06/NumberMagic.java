package chapter06;

import java.util.Scanner;

public class NumberMagic {

	public static void main(String[] args) {
		
		String select; //yes 또는 or
		int result=0; //사용자가 생각한 숫자를 출력하기 위한 변수
		System.out.println("1~30 사이의 숫자를 머리속으로 생각하세요");
		System.out.println("04 05 06 07 12");
		System.out.println("13 14 15 20 21");
		System.out.println("22 23 28 29 30");
		
		System.out.println("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");
		
		Scanner scan=new Scanner(System.in);
		select=scan.next();
		
		if(select.equals("y")) {
			result+=4;
		}
		//----------------------------------------------------------------------------
		System.out.println("------------------------------------");
		System.out.println("04 05 06 07 12");
		System.out.println("13 14 15 20 21");
		System.out.println("22 23 28 29 30");

		System.out.println("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");
		
		select=scan.next();
		
		if(select.equals("y")) {
			result+=16;
		}
		//------------------------------------------------------------------------
			System.out.println("------------------------------------");
			System.out.println("04 05 06 07 12");
			System.out.println("13 14 15 20 21");
			System.out.println("22 23 28 29 30");

			System.out.println("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");
			
			select=scan.next();
			
			if(select.equals("y")) {
				result+=1;
			}
		//------------------------------------------------------------------------
		System.out.println("------------------------------------");
		System.out.println("04 05 06 07 12");
		System.out.println("13 14 15 20 21");
		System.out.println("22 23 28 29 30");
		
		System.out.println("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");
				
		select=scan.next();
				
		if(select.equals("y")) {
			result+=8;
		}
			//------------------------------------------------------------------------
			System.out.println("------------------------------------");
			System.out.println("04 05 06 07 12");
			System.out.println("13 14 15 20 21");
			System.out.println("22 23 28 29 30");
			
			System.out.println("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");
					
			select=scan.next();
					
		if(select.equals("y")) {
			result+=2;
		}
		//------------------------------------------------------------------------------
		System.out.println("-----------------------------------");
		System.out.println("당신이 생각한 숫자는 "+result+"입니다.");
			
		
		
		}
	}

			
