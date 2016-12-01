public class CalculatorApp {
	public static void main(String[] args) {
	
		Calculator c = new Calculator();
		
		int result1 = c.plus(2, 5, 4);
		System.out.println(result1);

		double result2 = c.plus(2.4, 4.2, 3.0);
		System.out.println(result2);
	}
}