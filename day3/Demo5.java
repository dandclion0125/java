import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500��) 2:�����ֽ�(2000��) 3:�̿�����(1000��)");
		
		System.out.println("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();
		System.out.println("���Ḧ ������:");
		int no = sc.nextInt();

		if (no == 1)	{
			System.out.pritnln("Ŀ�Ǹ� �޾ư�����");
			if (money >= 1500) {
				System.out.println(money - 1500 + "���� �޾ư�����");
			}
		} 
		if (no ==2)	{
			System.out.println("�����ֽ��� �޾ư�����");
			if (money >= 2000) {
				System.out.println(money - 2000 + "���� �޾ư�����");
			}
		}
		if (no ==3)
		{
		}
	
	}
}