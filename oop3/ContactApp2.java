import java.util.Scanner;

public class ContactApp2 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		ContactMgr mgr = new ContactMgr();

		
		for ( ; ; ) {
			System.out.println("1: ��� | 2: ��ȸ | 0: ����");

			System.out.print("�޴� ��ȣ�� �Է��ϼ���:");
			int menuNo = s.nextInt();

			if (menuNo == 1) {
				//�迭�� ����ϱ�
				//mgr�� addContact(Contact contact))�޼��忡 ����� Contact��ü ����

				
				Contact contact = new Contact();

				System.out.print("��ȣ�� �Է��ϼ��� ");
				contact.setNo(s.nextInt());
				System.out.print("�̸��� �Է��ϼ��� ");
				contact.setName(s.next());
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� ");
				contact.setPhone(s.next());
				System.out.print("�̸����� �Է��ϼ��� ");
				contact.setEmail(s.next());

				mgr.addContact(contact);

			} else if (menuNo == 2) {
				//�迭�� ����� ��� ����ó ���� ǥ���ϱ� 
				//mgr�� displayContact()�� �����Ű�� 
				
				mgr.displayContact();

			} else if (menuNo == 0) {

				break;
			}

		}
	} 
}