package Chapter03.IF;

import java.util.Scanner;

public class ifExample_12 {

	public static void main(String[] args) {
		
		//�����ͺ��̽�(����Ŭ)
		String ID = "soldesk";
		int PW = 2589;
		
		//Scanner sccan�̶�� �ν��Ͻ� �������� ����
		Scanner scan = new Scanner(System.in);

		
		// ID��� �����濡 ���̵� �ޱ�(String)
		// PW��� �����濡 ��й�ȣ �ޱ� (String)
		System.out.print("���̵� : ");
		String InputID = scan.nextLine();
		if(ID.equals(InputID))
		{
			System.out.print("��й�ȣ : ");
			String InputPW = scan.nextLine();
			if(PW == Integer.parseInt(InputPW))
			{
				System.out.println("�α��ο� �����ϼ̽��ϴ�.");
			}
			else
			{
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		else
		{
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
}
