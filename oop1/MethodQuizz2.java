public class MethodQuizz2 {
	/*
	public static void a(int[] x, int y ) {
	
	int result = 0;
	
	for (int i=0; i<x.length; i++) {
	
		if (x[i] == y) {
			System.out.println((i + 1) + "��°�� " + y + "�� ���ԵǾ� �ֽ��ϴ�.");
		} else {
			result += 1;

		}
	
	}
	if (result == x.length) {
				System.out.println("��ġ���� �ʽ��ϴ�.");
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
			System.out.println("��ġ�մϴ�.");
		} else {
			System.out.println("����ġ");
		}
		
		return isExist;
	
	} 


	public static void main(String[] args) {
		
		int[] arr1 = {4, 3, 7, 9, 3 , 10, 22};
		boolean exist = a(arr1, 10);
		
		a(new int[]{1, 4, 7, 9, 6}, 3);
		
	}

}