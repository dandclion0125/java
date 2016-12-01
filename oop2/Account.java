/*
	은행계좌를 표현하는 클래스
		-속성
			예금주
			계좌번호
			비밀번호
			잔액
		-기능
			출금기능 - 금액과 비밀번호를 전달받아서 비밀번호가 개설시 입력한
						비밀번호와 일치하면 금액만큼을 잔액에서 감소시키고
						화면에 현재 잔액을 표시한다.
				
			입금기능 - 금액을 전달받아서 그 금액만큼 잔액을 증가시키고
						화면에 현재 잔액을 표시한다.

			조회기능 - 화면에 예금주, 계좌번호, 잔액을 표시한다.
*/


public class Account {
	String name;
	String acountNo;
	int password;
	int balance;


	// 출금기능

	public int withdraw2(int amount, int pwd) { //아닌 경우를 먼져 쳐내주면 코드가 복잡해지지 않는다.
		if (password != pwd) {
			System.out.println("비밀번호가 틀렸습니다.");
			return 0;
		}
			
		
		if (balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		System.out.println("잔액은" + balance + "원 입니다.");
		return amount;
	}


	public int withdraw(int amount, int pwd) {
		
		int money = 0;

		if (password == pwd) {
			if (balance >= amount) {
				balance -= amount;
				money = amount;
				System.out.println("잔액은" + balance + "원 입니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
			
			
		} else {
			
			System.out.println("비밀번호가 틀렸습니다.");
			return 0;
		}
		return money; 

	
	}

	public void deposit(int amount) {
		
	
		balance += amount;
		System.out.println("잔액은" + balance + "원 입니다.");

	}
	public void info(){
		System.out.println("##### 계좌정보 #####" );
		System.out.println("예금주  : " + name);
		System.out.println("계좌번호: " + acountNo);
		System.out.println("잔액    : " + balance);
	}
	

	

}