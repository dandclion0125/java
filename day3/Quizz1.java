import java.util.Scanner;  //������ �� ������ �̸� �����Ѵ�.

public class Quizz1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // System.in ->Ű���� �Է�

		// ����, ����, ���������� �Է¹޾Ƽ�
		// ���հ� ����� ����ϱ�

		System.out.print("���������� �Է��ϼ���:");
		int korScore = sc.nextInt();// Ű���� �Է��� ���ڷ� �о�´�.
		System.out.print("���������� �Է��ϼ���:");
		int engScore = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		int mathScore = sc.nextInt();

		int totalScore = korScore + engScore + mathScore;
		double avg = totalScore/3;
		System.out.println("����:" + totalScore);
		System.out.println("���:" + avg);
	}

}