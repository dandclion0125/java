public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;

		//float num3 = num2; // <--이 자동변환 과정에서 손실발생
		double num3 = num2; // double타입을 사용하므로써 손실을 막을 수 있다.
		num2 = (int) num3; // int타입으로 되돌려도 손실값은 돌아오지 않는다.

		int result = num1 - num2; // 0이 나오지 않고 -4가 나온다.
		System.out.println(result);

	}

}