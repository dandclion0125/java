import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:커피(1500원) 2:과일주스(2000원) 3:이온음료(1000원)");
		
		System.out.println("금액을 입력하세요:");
		int money = sc.nextInt();
		System.out.println("음료를 고르세요:");
		int no = sc.nextInt();

		if (no == 1)	{
			System.out.pritnln("커피를 받아가세요");
			if (money >= 1500) {
				System.out.println(money - 1500 + "원을 받아가세요");
			}
		} 
		if (no ==2)	{
			System.out.println("과일주스를 받아가세요");
			if (money >= 2000) {
				System.out.println(money - 2000 + "원을 받아가세요");
			}
		}
		if (no ==3)
		{
		}
	
	}
}