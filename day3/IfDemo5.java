import java.util.Scanner;

public class IfDemo5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500��) 2:�����ֽ�(2000��) 3:�̿�����(1000��)");
		
		int returnCoin = 0;
		System.out.println("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();
		System.out.println("���Ḧ ��������:");
		int no = sc.nextInt();

		if (no ==1 && money >= 1500)	{
			System.out.println("Ŀ�Ǹ� �޾ư�����");
			returnCoin = money - 1500;
		} else if (no == 2 && money >= 2000){
			System.out.println("�����ֽ��� �޾ư�����");
			returnCoin = money - 2000;
		} else if (no == 3 && money >= 1000){
			System.out.println("�̿����Ḧ �޾ư�����");
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
		System.out.println("�Ž�����: " + returnCoin + "��");
	}
}