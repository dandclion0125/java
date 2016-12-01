public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러 
		// 정수 연산일 경우 자바는 int타입을 기본으로 하기 때문에
		// 피연산자의 타입이나 크기에 상관없이 4byte로 저장한다. 
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3/4; //10을 4로 나누면 2.5지만 int값으로 변환하기 때문에 소수점 밑이 잘린다.
		System.out.println(intValue4);
		
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; //컴파일 에러 
		// 실수의 계산은 double타입에 담아서 계산해야한다.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);


	}
}