package chapter06;

import java.util.Random;

public class BaseballGameMain {

	public static void main(String[] args) {
		String check = "";
		BaseballGame game = new BaseballGame();
		
		do {
			check=game.check();
		} while (check!="WIN");

	}//main

}//class
