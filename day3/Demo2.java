public class Demo2  {
	public static void main(String[] args) {
		// ������ 3�� �̳��̰�, ������ 4.3�̻��� ���
		// ���б� ����
		int ranking = 4;
		double score = 4.4;

		boolean result = (ranking <= 3 && score >=4.3);
		System.out.println("�������: " + result);
		
		// ��ü ���űݾ��� 50���� �̻��̰ų� 
		// ���� ǰ�� �ϳ��� �ݾ��� 20���� �̻��� ��� ��ǰ�� ����
		int price1 = 180000;
		int price2 = 180000;
		int price3 = 180000;

		int totalPrice = price1 + price2 + price3;
		boolean result2 = totalPrice > 500000 || price1 >= 200000 || price2 >= 200000
			|| price3 >= 200000;
		System.out.println("�������: " 
			+ result2);
	}
}