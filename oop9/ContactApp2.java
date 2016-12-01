import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();

		for( ; ; ) {
			System.out.println("1.�̸���� | 2.��ȭ��ȣ��� | 3.�ּҵ��/���� | 4.��ȸ | 0.����");
			System.out.print("�޴��� �����ϼ���");
			int no = sc.nextInt();
			if (no == 1) {
				// �̸��� �Է¹޾Ƽ� Contact�� �����մϴ�.
				System.out.print("�̸��� �Է��ϼ���.");
				contact.setName(sc.next());
			} else if(no == 2) {
				
				Tel tel = new Tel();
				System.out.print("Ÿ���� �Է��ϼ���.");
				tel.setType(sc.next());
				System.out.print("��ȭ��ȣ�� �Է��ϼ���.");
				tel.setNumber(sc.next());
				contact.addTel(tel);


				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Tel��ü ���� --> �� �Է¹޾Ƽ� ä��� --> Contact�� addTel(Tel tel)����
				// Tel��ü �����ؼ� �迭�� ���
			} else if(no == 3) {
				
				Address addr = new Address();
				System.out.print("�����ȣ�� �Է��ϼ���.");
				addr.setZipcode(sc.next());
				System.out.print("��/���� �Է��ϼ���.");
				addr.setSido(sc.next());
				System.out.print("��/���� �Է��ϼ���.");
				addr.setGugun(sc.next());
				System.out.print("���ּҸ� �Է��ϼ���.");
				addr.setDetail(sc.next());
				
				contact.setAddress(addr);
				// �ּ� ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				// Address��ü ���� --> �� �Է¹޾Ƽ� ä���  --> Contact�� setter �̿��ؼ� ����
			} else if(no == 4) {
				contact.info();
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
			} else if(no == 0) {
				break;
				// ���α׷��� �����մϴ�.
			}
		}
		
		
	}
}


/*
Database�� ������� �ϴ� �۾�
	create		- �� ����Ÿ ���� 
	Retrieve	- ����Ÿ ��ȸ
	Update		- ����Ÿ ����
	Delete		- ����Ÿ ����
*/
