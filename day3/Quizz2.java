import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ�
		// 100�� �ڸ� ����
		// 10�� �ڸ� ����
		// 1�� �ڸ� ���ڸ� ���� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();

		int hundred = (int) number/100;
		int ten = (int) (number - 100*hundred)/10;
		int one = number - 100*hundred - 10*ten;

		System.out.println("100�� �ڸ�����: " + hundred);
		System.out.println("10�� �ڸ�����: " + ten);
		System.out.println("1�� �ڸ�����: " + one);


	}
}