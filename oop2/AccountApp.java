public class AccountApp {
	public static void main(String[] args) {
	
	Account ac1 = new Account();

	ac1.name = "±æµ¿";
	ac1.acountNo = "234-1535363-34636";
	ac1.password = 2233;
	ac1.balance = 200000;


	int result1 = ac1.withdraw(300000, 2233);
	ac1.withdraw(2000, 1111);
	ac1.withdraw(200000, 2233);

	ac1.info();
	
	ac1.deposit(300000);

	ac1.info();

	
	
	}
	


}