public class B {
	int x;
	static int y;

	public void m1() { //m1�� ����� ������ ��ü�� ������� �����Ƿ� ���డ��
		System.out.println(x);
		System.out.println(y);
	
	}
	// static �޼ҵ忡���� non-static ������ ����� �� ����.
	// this�� �̿��� �� ����.
	public static void m2() { // �ε��ϴ� ���� �޼ҵ尡 ����ǹǷ� ��ü�� ��������� ���̱� ������ x���� �ҷ��� �� ����.
		// System.out.println(x);
		System.out.println(y);
	
	}

	public void m3() {
		m1();
		m2();
	}
	// static�޼ҵ�dptjsms non-static �޼ҵ带 ����� �� ����.
	public static void m4() {
		// m1(); ������ ����
		m2();
	}

}