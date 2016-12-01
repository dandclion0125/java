public class ArrayApp {
	public static void main(String[] args) {
	
	ArrayService newArr1 = new ArrayService();

	/*
	int[] numbers1 = newArr1.move(5);
	for (int i=0 ; i<numbers1.length ; i++) {
		System.out.println(numbers1[i]);
	}
	
	
	int[] numbers2 = newArr1.copy(6);
	for (int i=0 ; i<numbers2.length ; i++) {
		System.out.println(numbers2[i]);
	
	}
	

	int[] numbers3 = newArr1.copy(2, 4);
	for (int i=0 ; i<numbers3.length ; i++) {
		System.out.println(numbers3[i]);
	
	}
	

	int[] numbers3 = newArr1.copy(2, 4);
	for (int i=0 ; i<numbers3.length ; i++) {
		System.out.println(numbers3[i]);
	
	}
	*/
	int[] numbers4 = newArr1.shift(9, 3);
	for (int i=0 ; i<numbers4.length ; i++) {
		System.out.println(numbers4[i]);

	}

	}
}