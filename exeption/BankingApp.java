import java.lang.*;

public class BankingApp {
	public static void main(String[] args) {
	
		Banking banking = new Banking("홍길동", "01-1111", "1234", 1000000, false);
		
		try {
			banking.changePassword("1234", "2222");
			
			int monye = banking.withdraw("2222", 200000000);

		} catch (BankingException e) {
			String errorMessage = e.getMessage();
			String errorCode = e.getErrorCode();
			System.out.println("오류 정보:["+errorCode+"] " + errorMessage);
		}
	}
}