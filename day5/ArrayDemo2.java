public class ArrayDemo2 {
	public static void main(String[] args) {
		// 배열 생성하기
		// int[] arr = {1, 2, 4, 5, 6};  <-- 값을 가지고 있는 배열 생성
		// int[] arr = new int[3];       <-- 값 3개를 담을 수 있는 배열 생성, 
		//                               <-- 객체 안의 값에는 0이 들어있다. double 일경우 0.0, String일 경우 null 
		// 정수형 0, 실수형 0.0, 문자형은 \u0000, 불린형은 false, 참조형은 null 

		int[] numbers = new int[3];                // 0이 출력된다.
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers);     // 해시코드가 출력 객체의 주소가 아니다.!!!!!!!


		String[] names = new String[3];             // null이 출력된다.
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names);      // 해시코드 출력

		
	}
}