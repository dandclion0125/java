public class Contact {
	// �Ӽ� �����ϱ�
	
	// ����
	int no;

	// �̸�
	String name;
	// ����ó
	String phoneNumber;
	// �̸���
	String eMail;
	
	// ��� �����ϱ�

	// ��ȭ�ϱ� call()
	public void call() {
		System.out.println(phoneNumber + "(��)�� ��ȭ�� �̴ϴ�.");
	}
	// ���ں����� sendMessage()
	public void sendMessage() {
		System.out.println(phoneNumber + "(��)�� ���ڸ� �����ϴ�.");
	}
	// ���Ϻ����� sendMail()
	public void sendMail() {
		System.out.println(eMail + "(��)�� ������ �����ϴ�.");
	}
}