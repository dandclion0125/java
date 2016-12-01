public class MethodQuizz2 {
	/*
	public static void a(int[] x, int y ) {
	
	int result = 0;
	
	for (int i=0; i<x.length; i++) {
	
		if (x[i] == y) {
			System.out.println((i + 1) + "번째에 " + y + "가 포함되어 있습니다.");
		} else {
			result += 1;

		}
	
	}
	if (result == x.length) {
				System.out.println("일치하지 않습니다.");
			}
	return;
	
	} */
	public static boolean a(int[] x, int y ) {
	
		boolean isExist = false;
	
		for (int i : x) {
		
			if (i == y) {
				isExist = true;
			} 
		}
		if (isExist == true) {
			System.out.println("일치합니다.");
		} else {
			System.out.println("불일치");
		}
		
		return isExist;
	
	} 


	public static void main(String[] args) {
		
		int[] arr1 = {4, 3, 7, 9, 3 , 10, 22};
		boolean exist = a(arr1, 10);
		
		a(new int[]{1, 4, 7, 9, 6}, 3);
		
	}

}