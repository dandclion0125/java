public class PromotionExample {
	public static void main(String[] args) {
		
		//자동타입변환
		byte byteValue = 10; // byteValue에 10을 대입 
		int intValue = byteValue; //intValue에 byteValue값인 10을 대입 //int <-- byte
		System.out.println(intValue); // 그 값을 출력

		char charValue = '가'; 
		intValue = charValue; // int <-- char
		System.out.println("가의 유니코드=" + intValue);

		intValue = 500;
		long longValue = intValue; // long <-- int
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue; // double <-- int
		System.out.println(doubleValue);

	}
}