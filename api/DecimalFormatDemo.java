import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		
		int number = 123456789;

		String pattern = "#,###"; // 숫자 (뒤부터)세개 찍고 콤마
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);

		System.out.println(text);

		double rate = 1412.345;

		//String pattern2 = "#,###.##"; // 소숫점 2자리까지 표현, 소숫점 3자리에서 반올림된다.
		//String pattern2 = "#,###.####"; // 빈자리를 채우지 않는다. 1,412.345
		String pattern2 = "0,000.0000"; //1,412.3450
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);
	}
}