public class MethodDemo1 {
	

	// �޼ҵ� ����(����)
	public static void a() {
		System.out.print("����ڰ� ������ a �޼ҵ��Դϴ�.");
	
	}
	// �Ű������� ������ �ִ� �޼ҵ� ����
	// �Ű������� �޼ҵ� ���࿡ �ʿ��� ���� ���޹޾Ƽ� ��´�.
	public static void b(int x) {
			System.out.println("b�޼ҵ尡 ����Ǿ����ϴ�.");
			System.out.println("b�޼ҵ� ����� ���޹��� ��: " + x);
	
	}

	public static void c(String x) {
		System.out.println("c�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("c�޼ҵ尡 ����� ���޹��� ��: " + x);

	}

	public static void d(int x, int y) {
		System.out.println("d�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("d�޼ҵ� ����� ���޹��� ��;" + x + ", " + y);
	}

	public static void e(String name, String email, int age) {
		System.out.println("e�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("e�޼ҵ� ����� ���޹��� ��: " + name);
		System.out.println("e�޼ҵ� ����� ���޹��� ��: " + email);
		System.out.println("e�޼ҵ� ����� ���޹��� ��: " + age);
	
	}
	
	public static void main(String[] args) {
		// �޼ҵ带 ȣ�� (����)
		a();
		// �Ű������� �ִ� �޼ҵ� ȣ��
		b(100);
		int k = 20;
		b(k);
		// b(); // ������ ����, b �޼ҵ带 �����ϱ� ���ؼ��� �ݵ�� ������ �ϳ��� ���޵Ǿ�� �Ѵ�.

		c("ȫ�浿");
		c("�ȳ�, " + "���� ȫ�浿�̶�� �մϴ�.");

		d(1, 4);
		d(1000, 2000);
		int i = 10;
		int j = 20;
		d(i, j);

		e("ȫ�浿", "hong@gmail.com", 23);
		e("������", "kim@gamil.com", j);
	}
}