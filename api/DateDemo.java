import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
	
		// 시스템의 현재 날짜/시간 정보를 가지는 Date객체 만들기
		Date now = new Date();
		System.out.println(now);  // Tue Nov 29 12:16:03 KST 2016 출력

		long time = now.getTime();
		System.out.println(time);
	}
}