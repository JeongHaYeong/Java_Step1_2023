package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	public static void Disp(String A[]) {
		String res = "";

		for (int i = 0; i < A.length; i++) {
			res += A[i] + "\n"; // 하나씩 뽑아준다 0~A의 길이 여기서 A는 main의 str의 길이 6;
		} // for

		/*
		 * 방법2 for (String str : A) { // ex))A를 복사해서 String str에 들어간다; res += str + " ";
		 * //if)) res = str+" " 이라면 정보가 쌓이지 않고 제일 마지막의 단어만 표시; }
		 */

		System.out.println(res);
		JOptionPane.showConfirmDialog(null, "배열의 원소값\n\n" + res);

	}// Disp

	public static void main(String[] args) {
		String str[] = { "Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp" };

		Disp(str);
	}// main //Disp뽑아내기

}
