package Practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// 3개의 정수값을 구하고 최댓값을 입력하라.
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구하여라.");
		System.out.print("a의 값은 : ");
		a = scan.nextInt();
		System.out.print("b의 값은 : ");
		b = scan.nextInt();
		System.out.print("c의 값은 : ");
		c = scan.nextInt();
		// max 구하기
		int max = 0;

		if (a > max) {
			max = a;
			if (b > max) {
				max = b;
				if (c > max) {
					max = c;
				}//in in if
			}//in if
		}//out if
		System.out.println("최댓값 : " + max);
	}//main
}//class
