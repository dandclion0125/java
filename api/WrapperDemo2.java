public class WrapperDemo2 {
	public static void main(String[] args) {
	
		// Integer�� ���� ���ҵ�

		// ���ڿ��� int������ ��ȯ�ϴ� �޼ҵ� : int parseInt(String text)
		int num1= Integer.parseInt("123");


		int num2 = Integer.parseInt("11", 2);	// 2�������� �����ִ� 11
		System.out.println("num2: " + num2);	// num2�� 3�� ���


		int num3 = Integer.parseInt("ab1", 16);	// 16������ ab1
		System.out.println("num3: " + num3);

		String str1 = Integer.toBinaryString(12);// �Է��� ���� 2������ ��ȯ�ؼ� ��ȯ 
		System.out.println("str1: " + str1);

		String str2 = Integer.toHexString(15345); // �Է��� ���� 16������ ��ȯ�ؼ� ��ȯ
		System.out.println("str2: " + str2);

		double num4 = Double.parseDouble("3.14");
		System.out.println(num4 * 2);

	}
}