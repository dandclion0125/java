public class Calculator {
	
	 /*
	// 정수 2개를 전달받아서 합을 계산하고 반환하는 메소드
	public int twoIntPlus(int a, int b) {
	
	}
	// 실수 2개를 전달받아서 합을 계산하고 반환하는 메소드
	public double towDoublePlus(double a, double b) {
	
	}

	// 정수 3개를 전달받아서 합을 계산하고 반환하는 메소드
	public int threeIntPlus(int a, int b, int c) {
	
	}
	// 실수 3개를 전달받아서 합을 계산하고 반환하는 메소드
	public double threeDoublePlus(double a, double b, double c) {
	
	}

	매개변수의 타입이 다르면서 갯수가 다를 경우 메소드 오버로딩이 가능
	*/

	public int plus(int a, int b) {
		System.out.println("정수 + 정수");
		return a + b;
	}

	public double plus(double a, double b) {
		System.out.println("실수 + 실수");
		return a + b;
	}

	public int plus(int a, int b, int c) {
		System.out.println("정수 + 정수 + 정수");
		return a + b + c;
	}

	public double plus(double a, double b, double c) {
		System.out.println("실수 + 실수 + 실수");
		return a + b + c;
	}


}