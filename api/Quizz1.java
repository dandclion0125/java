import java.util.Scanner;
import java.util.StringTokenizer;

public class Quizz1 {

	public static void main(String[] args) {
	
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
		// ��) eungsulee@hanmail.net ---> eungsulee

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸����� �Է��ϼ���: ");

		String email = sc.next();
		
		/*
		int index = email.indexOf("@");
		Sring id = email.substring(0, index);
		System.out.println("���̵�: " + id);
		*/
		/*
		String[] arr = email.split("@");
		System.out.println("���̵�: " + arr[0]);
		
		*/

		
		StringTokenizer st = new StringTokenizer(email, "@");

		String result = st.nextToken();
		System.out.println("���̵�: " + result);
	}
}