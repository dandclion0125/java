public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032; //강제변환시킬 데이터의 타입을 ()안에 넣는다.
		char charValue = (char) intValue; //int 값을 char로 강제변환
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 실수를 정수로 강제변환시켜 소수점 아래가 없어졌다.
		System.out.println(intValue);


	}

}