package chapter04.Example;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));
		int arr[] = new int[6];
		int cnt = 0;
		
		System.out.println("==== 이번주 로또 예상번호 ====");
		
		while (a > cnt) { //행
			System.out.print("[" + (cnt+1) + "] : ");
			
			outer : for(int i=0; i<arr.length;) { //열 
				//arr[i] = (int)(Math.random() * 45 + 1);
				arr[i] = new Random().nextInt(45)+1;
				//중복
				//q = (int)(Math.random() * 45 + 1);
				
				for(int j=0; j<i; j++) {//if 
					if(arr[i] == arr[j]) {
						continue outer; //outer로 되돌린다.
					}//if
					
				}//in for
				System.out.print(arr[i] + " ");
				i++;
				
				
			}//out for
			cnt++;
			System.out.println();
			/*
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			*/
			
//			for(int i=0; i<arr.length; i++) {
//				for(int j=0; j<i; j++) {
//					if(arr[i] == arr[j]) {
//						System.out.println("중복");
//					}
//				}
//			}
		
			//System.out.println();
			
		}//while
		
		
	}//main

}//class
