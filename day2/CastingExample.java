public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032; //������ȯ��ų �������� Ÿ���� ()�ȿ� �ִ´�.
		char charValue = (char) intValue; //int ���� char�� ������ȯ
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue; // �Ǽ��� ������ ������ȯ���� �Ҽ��� �Ʒ��� ��������.
		System.out.println(intValue);


	}

}