public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;

		//float num3 = num2; // <--�� �ڵ���ȯ �������� �սǹ߻�
		double num3 = num2; // doubleŸ���� ����ϹǷν� �ս��� ���� �� �ִ�.
		num2 = (int) num3; // intŸ������ �ǵ����� �սǰ��� ���ƿ��� �ʴ´�.

		int result = num1 - num2; // 0�� ������ �ʰ� -4�� ���´�.
		System.out.println(result);

	}

}