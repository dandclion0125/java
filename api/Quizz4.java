import java.util.Scanner;
import java.util.regex.Pattern;

public class Quizz4 {
	public static void main(String[] args) {
		
		//���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
		// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���)97~122

		
		// �˻��ϱ�

		// ���̵� 6���� �̻����� �˻��ϱ�

		// ���̵� ���� �ҹ��ڷθ� �����Ǿ����� �˻��ϱ� <----boolean
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("���̵� �Է��ϼ���. : ");
	
			String newId = sc.next();
			boolean invalid = false;  // <-- flag ���� : ���α׷��� ����Ǵ� ���¸� ��Ÿ���� ���� 
			
			if(newId.length()<6) {
				
				System.out.println("���̵� 6�� �̻� �Է��ϼ���");
				return;
			} 

			if(newId.length()>=6) {
				for(int i=0; i<newId.length();i++) {
					if((int)newId.charAt(i)<97 && (int)newId.charAt(i)>122) {
						invalid = true;	
						break;
					} 
				}
				
				if (invalid) {
				System.out.println("�ҹ��ڸ� �Է��� �� �ֽ��ϴ�.");
				}
			}
		
		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, newId);

		if (!valid) {
			System.out.println("��ȿ���� ����");
		}

		}
		

	}
}