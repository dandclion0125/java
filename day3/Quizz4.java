import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ� 
		// �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڸ� ���ڸ� �Է��ϼ���:");
		int number = sc.nextInt();
		int number2 = number/10;
		int number3 = number-(number2*10);
		String hangul1 = "";
		String hangul2 = "";
		
		if (number2 ==1){
			hangul1 = "��";
		} 
		if (number2 ==2){
			hangul1 = "�̽�";
		} 
		if (number2 ==3){
			hangul1 = "���";
		} 
		if (number2 ==4){
			hangul1 = "���";
		} 
		if (number2 ==5){
			hangul1 = "����";
		} 
		if (number2 ==6){
			hangul1 = "����";
		} 
		if (number2 ==7){
			hangul1 = "ĥ��";
		} 
		if (number2 ==8){
			hangul1 = "�Ƚ�";
		} 
		if (number2 ==9){
			hangul1 = "����";
		} 
		if (number3 ==1) {
			hangul2 = "��";
		}
		if (number3 ==2) {
			hangul2 = "��";
		}
		if (number3 ==3) {
			hangul2 = "��";
		}
		if (number3 ==4) {
			hangul2 = "��";
		}
		if (number3 ==5) {
			hangul2 = "��";
		}
		if (number3 ==6) {
			hangul2 = "��";
		}
		if (number3 ==7) {
			hangul2 = "ĥ";
		}
		if (number3 ==8) {
			hangul2 = "��";
		}
		if (number3 ==9) {
			hangul2 = "��";
		}
		System.out.println(hangul1 + hangul2);

	}
}