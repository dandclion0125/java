public class ArrayService {
	
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	
	// �迭 �̵���Ű��
	// arr1�迭���� �Էµ� ������ �ڸ��� ���� �ǵڷ� ������.
	public int[] move(int no) {
		
		int temp = arr1[no -1];
		for (int i=no-1 ; i<9; i++) {
			arr1[i] = arr1[i+1];
						
		}
		arr1[this.arr1.length -1] = temp;
		return arr1;
	}
	/*
	public int[] move(int no) {
		int[] result = new int[arr1.length];

		
		for (int i=0; i<arr1.length; i++) { // ���纻�� �����.
			result[i] = arr1[i];
		}
		
		//������ ���ڸ� �̸� �����س���.
		int temp = arr1[no-1];

		for (int i=no; i<arr1.length; i++) { // ������ ���ں��� ��ĭ�� �����.
			result[i-1] = arr1[i];
		}
		
		result[result.length-1] = number; //������ �ڸ��� no�� �Է�
		return result;
	}

	public static void main(String[] args) {
		ArrayService s = 
	}
	*/
	

	// arr4�迭�� �迭�� begin�� ��ġ�� ���� �������� step����ŭ �̵���Ų��.
	public int[] shift(int begin, int step) {
		
		int num = arr4[begin-1];
		for (int i=begin-1; i>=begin - step; i--) {
			arr4[i] = arr4[i-1];
						
		}
		arr4[begin -step -1] = num;
		return arr4;
	}


	// �迭 �����ϱ�
	// arr2�迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin) {
		int[] result3 = new int[this.arr2.length + 1 - begin];
		int position = 0;
		for (int i=begin-1 ; i<this.arr2.length; i++) {
			result3[position] = arr2[i];
			position++;
		}
		
		return result3;
	}
 

	// �迭 �߶󳻱�
	// arr3�迭�� ���������� �������� ������ ���ο� �迭 ��ȯ�ϱ�
	public int[] copy(int begin, int end) {
		int[] result4 = new int[end - begin +1];
		int position = 0;
		for (int i=begin-1 ; i<end; i++) {
			result4[position] = arr3[i];
			position++;
		}
		
		return result4;
	}



	

	
}