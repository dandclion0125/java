public class Quizz1 {
	public static void main(String[] args) {
		
		// �迭���� �ִ밪 ���ϱ�

		// ���� ū ���� ���� ����

		int max = 0;
		int[] numbers = {1, 5, 3, 8, 2};

		for (int n : numbers) {
			
			if ( n> max) {
				max = n;
			}
		}
		System.out.println("���� ū ��: " + max);

	}
}