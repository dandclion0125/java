import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class Anniversary {
	public static void main(String[] args) throws ParseException{
		
		System.out.println("args[0]" + args[0]);
		System.out.println("args[1]" + args[1]);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = sdf.parse(args[0]); // 문자열값을 Date값으로

		long time = day.getTime();

		long period = (long)Integer.parseInt(args[1]) *60*60*24*1000;

		day.setTime(time + period);

		System.out.println("["+args[1]+"]일째 되는 날:" + sdf.format(day));

		/*
		Date annDay = new Date();
		Calendar currTime = Calendar.getInstance();
		
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		currTime.set(2013,12,25);

		int year = currTime.get(Calendar.YEAR);
		int month = currTime.get(Calendar.MONTH)+1;
		int day = currTime.get(Calendar.DATE);

		
		System.out.printf("사귀기 시작한 날은 %d/%d/%d 입니다.\n", );

		*/
		
	}
}