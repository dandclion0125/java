/*
	������¸� ǥ���ϴ� Ŭ����
		-�Ӽ�
			������
			���¹�ȣ
			��й�ȣ
			�ܾ�
		-���
			��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ� ��й�ȣ�� ������ �Է���
						��й�ȣ�� ��ġ�ϸ� �ݾ׸�ŭ�� �ܾ׿��� ���ҽ�Ű��
						ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.
				
			�Աݱ�� - �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű��
						ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.

			��ȸ��� - ȭ�鿡 ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
*/


public class Account {
	String name;
	String acountNo;
	int password;
	int balance;


	// ��ݱ��

	public int withdraw2(int amount, int pwd) { //�ƴ� ��츦 ���� �ĳ��ָ� �ڵ尡 ���������� �ʴ´�.
		if (password != pwd) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return 0;
		}
			
		
		if (balance < amount) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		balance -= amount;
		System.out.println("�ܾ���" + balance + "�� �Դϴ�.");
		return amount;
	}


	public int withdraw(int amount, int pwd) {
		
		int money = 0;

		if (password == pwd) {
			if (balance >= amount) {
				balance -= amount;
				money = amount;
				System.out.println("�ܾ���" + balance + "�� �Դϴ�.");
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			
			
		} else {
			
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return 0;
		}
		return money; 

	
	}

	public void deposit(int amount) {
		
	
		balance += amount;
		System.out.println("�ܾ���" + balance + "�� �Դϴ�.");

	}
	public void info(){
		System.out.println("##### �������� #####" );
		System.out.println("������  : " + name);
		System.out.println("���¹�ȣ: " + acountNo);
		System.out.println("�ܾ�    : " + balance);
	}
	

	

}