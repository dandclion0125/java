import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatDemo {
	public static void main(String[] args) {
	
	
		//
		Date now = new Date();

		//String pattern = "yyyy.MM.dd hh:mm:ss"; // 2134.01.01 // yyyy.M.d  --> 2134.1.1
		//String pattern = "yy년 M월 d일 E요일"; // 16년 11월 29일 화요일
		String pattern = "a h시 m분 s초"; // 오후 4시 25분 6초
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);
		System.out.println(text);
	}
}