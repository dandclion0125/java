public class PromotionExample {
	public static void main(String[] args) {
		
		//�ڵ�Ÿ�Ժ�ȯ
		byte byteValue = 10; // byteValue�� 10�� ���� 
		int intValue = byteValue; //intValue�� byteValue���� 10�� ���� //int <-- byte
		System.out.println(intValue); // �� ���� ���

		char charValue = '��'; 
		intValue = charValue; // int <-- char
		System.out.println("���� �����ڵ�=" + intValue);

		intValue = 500;
		long longValue = intValue; // long <-- int
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue; // double <-- int
		System.out.println(doubleValue);

	}
}