package Chapter03.IF;

import java.util.Scanner;

public class ifExample_11 {

	
	public static void main(String[] args) {
		//Scanner scan�̶�� �ν��Ͻ� �������� ����
		Scanner scan=new Scanner(System.in);
		
		//ID��� �����濡 (String)
		System.out.print("���̵� : ");
		String ID= scan.nextLine();
		
		//PW��� �����濡 ��й�ȣ �ޱ� (String)
		System.out.print("��й�ȣ : ");
		String PW= scan.nextLine();
		
		//��й�ȣ�� ����ȯ
		int pass=Integer.parseInt(PW);
		//pw=scan.nextInt();
								
		//��øif���� ����Ͽ� �α��� ����, ��й�ȣ �ٸ�, ���̵� ����
		
		if(ID.equals("soldesk") && pass == 20220617) {
				System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
				
//		if(ID.equals("soldesk")) {
//			if(pass == 20220617) {
//				System.out.println("�α��� ����");
//			}else {
//				System.out.println("��й�ȣ �ٸ�");
//			}
//		}else {
//			System.out.println("���̵� ����");
//		}	
		
		
	}
}
