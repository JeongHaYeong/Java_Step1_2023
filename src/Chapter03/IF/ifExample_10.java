package Chapter03.IF;

public class ifExample_10 {


	public static void main(String[] args) {

		String ID="soldesk"; //�ν��Ͻ� ������
		//Ŭ����
		int PW=20220614; //������ ������
		//�ڷ���

		
		if(ID.equals("soldesk")) {
			if(PW==2022) {
				System.out.println(ID+"�� ȯ���մϴ�.");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}
			
	}
}
