public class MethodQuizz11 {

	
	public static int max1(int[] numbers) {
		int max = 0;
		for (int i=0; i<numbers.length; i++) { // for (int i : numbers)
			if (numbers[i]>max) {
				max = numbers[i];
			}
		
		}
		return max;
	}

	/*
	public static int maxCom(int[] values) {
		int max = 0;
		for(int i=0; i<values.length; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		} return max;
	}*/
	public static void main(String[] args) {

	    int[] num2 = {1, 2, 4, 7};
		int max2 = max1(num2);
		System.out.println("최대값 : " + max2);

		int[] num3 = {50, 23, 11, 299, 3049, 3};
		int max4 = max1(num3);
		System.out.println("최대값 : " + max4);
		
	}

	
	/*public static void main(String[] args) {
		System.out.println("최대값 : " + maxCom(new int[] {1, 3, 30, 5, 6}));
	}*/

	
}
