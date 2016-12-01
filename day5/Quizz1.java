public class Quizz1 {
	public static void main(String[] args) {
		
		// 배열에서 최대값 구하기

		// 가장 큰 값을 담을 변후

		int max = 0;
		int[] numbers = {1, 5, 3, 8, 2};

		for (int n : numbers) {
			
			if ( n> max) {
				max = n;
			}
		}
		System.out.println("가장 큰 수: " + max);

	}
}