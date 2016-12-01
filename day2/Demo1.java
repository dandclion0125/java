public class Demo1 {
	public static void main(String[] args) {
		// 정수 타입
		byte b1 = 23; // b1에 23을 대입한다.
		byte b2 = -126; // b2에 -126을 대입한다.
		//byte b3 = 128; byte 자료형의 범위를 밧어난 값은 오류 발생시킨다.

		int a1 = 128; 
		int a2 = -128;

		long c1 = 10000;
		// 숫자의 범위가 int의 범위를 벗어나는 값이 경우 반드시
		// 숫자 끝에 L을 표시해야 한다. 
		long c2 = 100000000000L;

		int m1 = 10; // 십진수로 10을 표현
		int m2 = 012; // 8진수로 10을 표현
		int m3 = 0xA; // 16진수로 10을 표현

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		int m4 = 100_000_000; // 자바7버전부터 _를 이용해 숫자를 끊어서 적는 것이 가능해졌다. 가독성이 좋아지고 쓰기도 편해졌다. 
		int m5 = 5;
		System.out.println(m4 * m5);


		


	}
}