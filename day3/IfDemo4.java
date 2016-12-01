import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500원) 2:과일주스(2000원) 3:이온음료(1000원)");
		
		int returnCoin = 0;


		System.out.println("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.println("음료를 고르세요:");
		int no = sc.nextInt();

		if (no == 1 && money >= 1500)	{
			System.out.println("커피를 받아가세요");
			//System.out.println(money - 1500 + "원을 받아가세요");
			returnCoin = money - 1500;

		} 
		if (no ==2 && money >= 2000)	{
			System.out.println("과일주스를 받아가세요");
			//System.out.println(money - 2000 + "원을 받아가세요");
			returnCoin = money - 2000;
		}
		if (no ==3 && money >= 1000) {
			System.out.println("이온음료를 받아가세요");
			//System.out.println(money - 1000 + "원을 받아가세요");
			returnCoin = money - 1000;
		}
		System.out.println("거스름돈:" + returnCoin);

		//거스름돈을 처리
		// 5000원짜리 1000원짜리 500원짜리 ...로 나눠라
	
		int return1 = returnCoin/100;
		int return2 = returnCoin/500;
		int return3 = returnCoin/1000;
		int return4 = returnCoin/5000;
			
		if (returnCoin >= 5000) {
			return3 = (returnCoin - 5000*return4)/1000;
			return2 = (returnCoin - 5000*return4 -1000*return3)/500;
			return1 = (returnCoin - 5000*return4 -1000*return3 - 500*return2)/100;					
		} else if (returnCoin >=1000 && returnCoin < 5000) {
			return2 = (returnCoin - 1000*return3)/500;
			return1 = (returnCoin - 1000*return3 - 500*return2)/100;
		} else if (returnCoin >=500 && returnCoin <1000) {
			return1 = (returnCoin -500*return2)/100;
		}
		

		System.out.println("5000원:" + return4 + "개");
		System.out.println("1000원:" + return3 + "개");
		System.out.println("500원:" + return2 + "개");
		System.out.println("100원:" + return1 + "개");

		
	}
}