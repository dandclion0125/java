import java.util.*;

public class CalendarDemo2 {

	public static void main(String[] args) {
	
		
		// Date  ---->  Calendar
		Date date = new Date();
		long time = date.getTime();

		Calendar cal = Calendar.getInstance();
		// cal.setTime(date);
		cal.setTimeInMillis(time); // �и������尪�� �ش��ϴ� Calendar�� ����ȴ�. 

		// Calendar ---> Date
		// Calendar��ü�� ��¥�� �ش��ϴ� Date ��ü�� ��ȯ�ȴ�. 
		Date date2 = cal.getTime();
	}
}