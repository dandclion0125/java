public class AccountApp {
	public static void main(String[] args) {
	
		Account a = new Account("ȫ�浿", "39492-285838934", 1111, 1000000);

		//System.out.println("������: " + a.owner); //owner�� ������ �� ����\
		System.out.println("������: " + a.getOwner());
		a.info();
	}
}