public class ArrayDemo1 {
	public static void main(String[] args) {
		
		// ���� 5���� ������ �ִ� �迭 �����
		int[] numbers = {1, 5, 8, 10, 4,34,5,6,2,55,2,7,8,1,7,6,9,6,78};
		int numbers1[] = {2, 6, 8, 9, 4};

		//�迭�� ũ�⸦ �˾Ƴ���
		// numbers.length
		int size = numbers.length;
		System.out.println("�迭�� ũ��:" + size);

		// �迭���� �� ��������
		// numbers[�ε��� ��ȣ]
		int x = numbers[0];
		int y = numbers[1];
		System.out.println("�迭�� 0��° ��:" + x);
		System.out.println("�迭�� 1��° ��:" + y);

		// ��� ������ �հ踦 ���ϱ�
		//int total = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		//System.out.println("�հ�:" + total);
		/*
		int total = 0;
		total += numbers[0];
		total += numbers[1];
		total += numbers[2];
		total += numbers[3];
		total += numbers[4];
		System.out.println("�հ�:" + total);

		

		int total = 0;
		for (int i=0; i<size; i++) {
			total +=numbers[i];

		}
		System.out.println("�հ�:" + total);
		*/

		int total = 0;
		for (int a : numbers ) {
			total += a;
		}
		
		System.out.println("�հ�:" + total);
	}	
}