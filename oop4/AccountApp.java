import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Acount acc = new Acount();
		
		for ( ; ;) {
			System.out.println("1. 등록 | 2. 조회 | 3. 비번변경 | 4. 입금 | 5. 출금 | 6. 종료\n");

			System.out.println("메뉴 선택>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("이름을 입력하세요");
				acc.setName(sc.next());
				System.out.print("비밀번호를 입력하세요");
				acc.setPassword(sc.nextInt());
				System.out.print("초기입금액을 입력하세요");
				acc.setBalance(sc.nextInt());

				System.out.println("당신의 계좌번호는 : " + acc.getAcountnuber());

								
			} else if (menuNo == 2) {
				System.out.println(acc.getName() + "님의 계좌정보");
				System.out.println("잔액은" + acc.getBalance()+ "입니다.");
					
			
			} else if (menuNo == 3) {
				
				System.out.println("기존 비밀번호를 입력하세요.");
				int password1 = 0;
				password1 = sc.nextInt();
				if (acc.getPassword() == password1) {
					System.out.println("새로운 비밀번호를 입력하세요.");
					acc.setPassword(sc.nextInt());
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}

				
			
			} else if (menuNo == 4) {
				System.out.print("입금액을 입력하세요.");

				int deposit = sc.nextInt();
				int newBalance = 0;
				newBalance = acc.getBalance() + deposit;
				acc.setBalance(newBalance);
				System.out.println("잔액은" + newBalance + "원 입니다.");
				
			
			
			} else if (menuNo == 5) {
				System.out.print("비밀번호를 입력하세요.");
				if (acc.getPassword() == sc.nextInt()) {
					System.out.print("출금액을 입력하세요.");
					int withdraw = sc.nextInt();
					if (withdraw<acc.getBalance()) {
						int newBalance1 = acc.getBalance() - withdraw;
						acc.setBalance(newBalance1);
						System.out.println("잔액은" + newBalance1 + "원 입니다.");
					} else {
						System.out.print("잔액이 부족합니다.");
						
					}
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
				
			
			
			} else if (menuNo == 6) {
			
				break;
			}
 
		
		}
	}
}