public class Acount {
	
	// �̸�, ���¹�ȣ, ��й�ȣ, �ܾ�
	// �Ӽ� ����

	// �⺻ ������ ����

	// getter/setter����
	private String name;
	private String acountNumber;
	
	private int password;
	private int balance;

	public Acount(){
		acountNumber = "111-1111";
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcountnuber() {
		return acountNumber;
	}

	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	

}