public class WrapperDemo2 {
	public static void main(String[] args) {
	
		// Integer의 정적 베소드

		// 문자열을 int값으로 변환하는 메소드 : int parseInt(String text)
		int num1= Integer.parseInt("123");


		int num2 = Integer.parseInt("11", 2);	// 2진법으로 적혀있는 11
		System.out.println("num2: " + num2);	// num2는 3이 출력


		int num3 = Integer.parseInt("ab1", 16);	// 16진수의 ab1
		System.out.println("num3: " + num3);

		String str1 = Integer.toBinaryString(12);// 입력한 값을 2진수로 변환해서 반환 
		System.out.println("str1: " + str1);

		String str2 = Integer.toHexString(15345); // 입력한 값을 16진수로 변환해서 반환
		System.out.println("str2: " + str2);

		double num4 = Double.parseDouble("3.14");
		System.out.println(num4 * 2);

	}
}