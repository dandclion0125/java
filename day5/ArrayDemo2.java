public class ArrayDemo2 {
	public static void main(String[] args) {
		// �迭 �����ϱ�
		// int[] arr = {1, 2, 4, 5, 6};  <-- ���� ������ �ִ� �迭 ����
		// int[] arr = new int[3];       <-- �� 3���� ���� �� �ִ� �迭 ����, 
		//                               <-- ��ü ���� ������ 0�� ����ִ�. double �ϰ�� 0.0, String�� ��� null 
		// ������ 0, �Ǽ��� 0.0, �������� \u0000, �Ҹ����� false, �������� null 

		int[] numbers = new int[3];                // 0�� ��µȴ�.
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers);     // �ؽ��ڵ尡 ��� ��ü�� �ּҰ� �ƴϴ�.!!!!!!!


		String[] names = new String[3];             // null�� ��µȴ�.
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names);      // �ؽ��ڵ� ���

		
	}
}