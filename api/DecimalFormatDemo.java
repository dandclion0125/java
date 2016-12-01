import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		
		int number = 123456789;

		String pattern = "#,###"; // ���� (�ں���)���� ��� �޸�
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);

		System.out.println(text);

		double rate = 1412.345;

		//String pattern2 = "#,###.##"; // �Ҽ��� 2�ڸ����� ǥ��, �Ҽ��� 3�ڸ����� �ݿø��ȴ�.
		//String pattern2 = "#,###.####"; // ���ڸ��� ä���� �ʴ´�. 1,412.345
		String pattern2 = "0,000.0000"; //1,412.3450
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);
	}
}