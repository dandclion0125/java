public class PhotoPrinter extends Printer {

	int size;

	// �θ�Ŭ����(Printer)�� print(String text) �޼ҵ� ������
	public void print(String data) { // Ÿ���� ����, �������� �޶� �ȴ�.
		System.out.println("["+data+"]�� ������ȭ���� �μ��մϴ�.");
	}

	public void edit() {
		System.out.println("������ �����մϴ�.");
	}
}