package chapter06;

import java.util.Random;

import javax.swing.JOptionPane;

//import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

public class Start {

	private int pcnum = new Random().nextInt(50) + 1;
	private int count = 0;
	private String result = "FAIL";

	public String check(int num) {

		// random값보다 작으면 up / 크면 down / 일치하면 -> result="SUCCESS"
		// System.out.println(random);
		count++;

		// int num=Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요"));
		if (num < pcnum) {
			System.out.println("up!");
		} else if (num > pcnum) {
			System.out.println("down!");
		} else {
			System.out.println(count + "회 만에 정답!!");
			result = "SUCCESS";
		}

		return result;
	}

}
	

