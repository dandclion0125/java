import java.util.Random;
import java.util.Date;

public class MethodDemo3 {

	// 난수를 발생시키는 메소드 만들기
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100);
		

		//return 키워드는 이 메소드를 호출한 곳에 값을 반환한다.
		return number;
	}
	
	// 오늘 날짜를 반환하는 메소드 만들기
	public static String getCurrentDate() {
		Date now = new Date();
		String str = now.toString();
		
		return str;

	}

	public static void main(String[] args) {
		int x = random();
		System.out.println(x);

		System.out.println(random() * 100);

		int y = random() * 1000;
		//System.out.println(a() * 100);
		// a메소드는 void타입으로 값을 출력하지 않기때문에
		// 오류가 난다.

		String d = getCurrentDate();
		System.out.println(d);

	}

}