import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// ����, ����, ���� ������ �Է¹޾Ƽ� 
		// ����, ���, ������ ����ϱ�
		// ������ 90�̻�:A, 80�̻�:B, 70�̻�:C, 60�̻�:D, �׿ܴ� F
		Scanner sc = new Scanner(System.in);
				
		System.out.println("���� ������ �Է��ϼ���:");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int math = sc.nextInt();

		int total = kor + eng + math;
		System.out.println("����: " + total);
		double avg = total/3;
		System.out.println("���: " + avg);

		if (avg >= 90) {
			System.out.println("����: " + "A");
		} else if (avg >= 80 && avg < 90) {
			System.out.println("����: " + "B");
		} else if (avg >= 70 && avg < 80) {
			System.out.println("����: " + "C");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("����: " + "D");
		} else {
			System.out.println("����: " + "F");
		}

	}
}
