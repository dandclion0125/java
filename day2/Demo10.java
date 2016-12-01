public class Demo10 {
	public static void main(String[] args) {
		// 산술 연산자
		int a = 10;
		int b = 5;
		// 연산은 항상 새로운 값을 생성해낸다.\
		// 반드시 그 값을 변수에 담자.
		int c = a + b;
		int d = a - b;
		int e = a*b;
		int f = a/b;
		int g = a%b;

		System.out.println(g);
		// 덧셈(+)연산자는 문자열과 관련 있을 경우 이어붙이기로 동작한다.
		// "문자열" + 숫자      ----> "문자열숫자"
		// 숫자     + "문자열"  ----> "숫자문자열"
		// "문자열" + "문자열"  ----> "문자열문자열"
		String x = "가나다라";
		String y = "hello";

		String z = x + y;
		// 덧셈연산자는 문자일 경우 이어붙이기로 동작한다.

		System.out.println(z);
		System.out.println(3 + 6 + "hello"); // 9hello로 출력   9 + "hello" -> "9hello"--------->순서로 처리되므로
		System.out.println("hello" + 3 + 6); // hello36로 출력  "hello3" + 6 -> "hello36"문자열이 되면 끝까지 문자열
		System.out.println("hello" + (3 + 6)); // hello9로 출력 ()안을 먼저계산하므로 "hello" + 9 -> "hello9"

		int kor = 60;
		int eng = 70;
		int math = 30;
		
		System.out.println("총점:" + (kor + eng + math));


	}

}