import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 1000000;

		for (; ; ) { // ���ѷ���
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("[1]�ӱ� | [2]��� | [3]��ȸ | [0]����");
			System.out.println("--------------------------------");
			System.out.print("�޴��� �����ϼ���:");
			
			int menuNo = sc.nextInt();

			

			if (menuNo == 1) {
				System.out.println("�Աݾ�: ");
				int deposit = sc.nextInt();
				balance += deposit;
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
			} else if (menuNo == 2) {
				System.out.println("��ݾ�: ");
				int withdraw = sc.nextInt();
				
				if (balance >= withdraw) {
					balance -= withdraw;
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				
			} else if (menuNo == 3) {
				System.out.println("�ܰ�: " + balance);
				
			} else if (menuNo == 0) {
				System.out.println("���α׷��� �����մϴ�........");

				break;
				
			}
		}
	}
}