import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Acount acc = new Acount();
		
		for ( ; ;) {
			System.out.println("1. ��� | 2. ��ȸ | 3. ������� | 4. �Ա� | 5. ��� | 6. ����\n");

			System.out.println("�޴� ����>");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("�̸��� �Է��ϼ���");
				acc.setName(sc.next());
				System.out.print("��й�ȣ�� �Է��ϼ���");
				acc.setPassword(sc.nextInt());
				System.out.print("�ʱ��Աݾ��� �Է��ϼ���");
				acc.setBalance(sc.nextInt());

				System.out.println("����� ���¹�ȣ�� : " + acc.getAcountnuber());

								
			} else if (menuNo == 2) {
				System.out.println(acc.getName() + "���� ��������");
				System.out.println("�ܾ���" + acc.getBalance()+ "�Դϴ�.");
					
			
			} else if (menuNo == 3) {
				
				System.out.println("���� ��й�ȣ�� �Է��ϼ���.");
				int password1 = 0;
				password1 = sc.nextInt();
				if (acc.getPassword() == password1) {
					System.out.println("���ο� ��й�ȣ�� �Է��ϼ���.");
					acc.setPassword(sc.nextInt());
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}

				
			
			} else if (menuNo == 4) {
				System.out.print("�Աݾ��� �Է��ϼ���.");

				int deposit = sc.nextInt();
				int newBalance = 0;
				newBalance = acc.getBalance() + deposit;
				acc.setBalance(newBalance);
				System.out.println("�ܾ���" + newBalance + "�� �Դϴ�.");
				
			
			
			} else if (menuNo == 5) {
				System.out.print("��й�ȣ�� �Է��ϼ���.");
				if (acc.getPassword() == sc.nextInt()) {
					System.out.print("��ݾ��� �Է��ϼ���.");
					int withdraw = sc.nextInt();
					if (withdraw<acc.getBalance()) {
						int newBalance1 = acc.getBalance() - withdraw;
						acc.setBalance(newBalance1);
						System.out.println("�ܾ���" + newBalance1 + "�� �Դϴ�.");
					} else {
						System.out.print("�ܾ��� �����մϴ�.");
						
					}
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				
				
			
			
			} else if (menuNo == 6) {
			
				break;
			}
 
		
		}
	}
}