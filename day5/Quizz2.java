import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� ����� 
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		System.out.print("���� ������ �� �л����� ���� �Է��ϼ���:");
		int size = sc.nextInt();  // �л��� == �迭�� ũ��
		
		int total = 0;
		double  avg = 0;

		int[] students = new int[size]; // �л� �� ��ŭ�� ������ ���� �迭 �����
		
		// �迭�� ���� ������ �����ϱ�
		for (int i=0; i<size; i++) {
			System.out.print("���������� �Է��ϼ���: ");
			int score = sc.nextInt();
			students[i] = score;
			
		}

		// ������ ��� ����ϱ�
		/*
		for (int a=0; a<size; a++) {
			total += students[a];
			avg = total/size;
		}
		*/
		for (int score: students) {
			total += score;
			
		}
		avg = total/size;


		System.out.printf("����:%d, ���:%d\n", total, avg );
		/*
		System.out.println("�հ�: " + total);
		System.out.println("���: " + avg);
		*/
	}
}