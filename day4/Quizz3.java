import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 1000000;

		for (; ; ) { // 무한루프
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("[1]임금 | [2]출금 | [3]조회 | [0]종료");
			System.out.println("--------------------------------");
			System.out.print("메뉴를 선택하세요:");
			
			int menuNo = sc.nextInt();

			

			if (menuNo == 1) {
				System.out.println("입금액: ");
				int deposit = sc.nextInt();
				balance += deposit;
				System.out.println("입금이 완료되었습니다.");
			} else if (menuNo == 2) {
				System.out.println("출금액: ");
				int withdraw = sc.nextInt();
				
				if (balance >= withdraw) {
					balance -= withdraw;
					System.out.println("출금이 완료되었습니다.");
					
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				
			} else if (menuNo == 3) {
				System.out.println("잔고: " + balance);
				
			} else if (menuNo == 0) {
				System.out.println("프로그램을 종료합니다........");

				break;
				
			}
		}
	}
}