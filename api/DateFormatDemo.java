import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatDemo {
	public static void main(String[] args) {
	
	
		//
		Date now = new Date();

		//String pattern = "yyyy.MM.dd hh:mm:ss"; // 2134.01.01 // yyyy.M.d  --> 2134.1.1
		//String pattern = "yy�� M�� d�� E����"; // 16�� 11�� 29�� ȭ����
		String pattern = "a h�� m�� s��"; // ���� 4�� 25�� 6��
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);
		System.out.println(text);
	}
}