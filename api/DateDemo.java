import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
	
		// �ý����� ���� ��¥/�ð� ������ ������ Date��ü �����
		Date now = new Date();
		System.out.println(now);  // Tue Nov 29 12:16:03 KST 2016 ���

		long time = now.getTime();
		System.out.println(time);
	}
}