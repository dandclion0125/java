public class LongExample {
	public static void main(String[] args) {
		long var1 = 10; 
		long var2 = 20L;
		// long var3 = 1000000000000 //컴파일 에러
		long var4 = 1000000000000L; //long 타입이라도 int의 범위를 벗어나는 수의 입력 뒤에는 L을 적어줘야한다.

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}