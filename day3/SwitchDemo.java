public class SwitchDemo {
	public static void main(String[] args) {
		
		String grade = "Silver"; // �ڹ�7���� ��󰪿� ���ڿ� �Է� ����

		switch (grade) { //()�ȿ� �񱳴���� �Ǵ� ���� �Է�
			case "Gold":
				System.out.println("����� ���� ȯ���մϴ�.");
				break;
			case "Silver":
				System.out.println("�ǹ���� ���� ȯ���մϴ�.");
				break;
			case "Bronze":
				System.out.println("������� ���� ȯ���մϴ�.");
				break;
			default:
				System.out.println("�մ� ȯ���մϴ�.");
		
		}
	}
}