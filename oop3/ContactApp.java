import java.util.Scanner;

public class ContactApp {

	public static void main(String[] args) {
	
		//����ó ������ �Է¹޴� ȭ�� ���� Ŭ����
		//������� �Է��� �о���� Scanner ��ü �����ϱ�
			
		Scanner s = new Scanner(System.in);

		Contact[] contacts = new Contact[100];
		int currentPosition = 0;

		for ( ; ; ) {
			System.out.println("1: ��� | 2: ��ȸ | 0: ����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = s.nextInt();

			if (menuNo == 1) {
				

				
				Contact c = new Contact();
				contacts[currentPosition] = c;

				System.out.print("��ȣ�� �Է��ϼ��� ");
				c.setNo(s.nextInt());
				System.out.print("�̸��� �Է��ϼ��� ");
				c.setName(s.next());
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� ");
				c.setPhone(s.next());
				System.out.print("�̸����� �Է��ϼ��� ");
				c.setEmail(s.next());
				//�迭�� ����ϱ�
				//Contact��ü�� �����ؼ� 
				// �迭�� currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ�
				//currentPisition�� ���� 1������Ų��.
				currentPosition++;

			} else if (menuNo == 2) {

				for(int a=0; a<currentPosition; a++) {
					
					System.out.println("��ȣ     : " + contacts[a].getNo());
					System.out.println("�̸�     : " + contacts[a].getName());
					System.out.println("��ȭ��ȣ : " + contacts[a].getPhone());
					dfSystem.out.println("�̸���   : " + contacts[a].getEmail());
					 
				}
				//�迭�� ����� ��� ����ó ���� ǥ���ϱ� 
				//<-- enhanced for�� ������� ���� ����
				// �������� null�̸� break�� ����������
				//�迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���

			} else if (menuNo == 0) {
				break;
			}

		}
	}
}