import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500��) 2:�����ֽ�(2000��) 3:�̿�����(1000��)");
		
		int returnCoin = 0;


		System.out.println("�ݾ��� �Է��ϼ���:");
		int money = sc.nextInt();
		System.out.println("���Ḧ ������:");
		int no = sc.nextInt();

		if (no == 1 && money >= 1500)	{
			System.out.println("Ŀ�Ǹ� �޾ư�����");
			//System.out.println(money - 1500 + "���� �޾ư�����");
			returnCoin = money - 1500;

		} 
		if (no ==2 && money >= 2000)	{
			System.out.println("�����ֽ��� �޾ư�����");
			//System.out.println(money - 2000 + "���� �޾ư�����");
			returnCoin = money - 2000;
		}
		if (no ==3 && money >= 1000) {
			System.out.println("�̿����Ḧ �޾ư�����");
			//System.out.println(money - 1000 + "���� �޾ư�����");
			returnCoin = money - 1000;
		}
		System.out.println("�Ž�����:" + returnCoin);

		//�Ž������� ó��
		// 5000��¥�� 1000��¥�� 500��¥�� ...�� ������
	
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
		

		System.out.println("5000��:" + return4 + "��");
		System.out.println("1000��:" + return3 + "��");
		System.out.println("500��:" + return2 + "��");
		System.out.println("100��:" + return1 + "��");

		
	}
}