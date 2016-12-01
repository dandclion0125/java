public class ArrayService {
	
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	
	// 배열 이동시키기
	// arr1배열에서 입력된 숫자의 자리를 비우고 맨뒤로 보낸다.
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

		
		for (int i=0; i<arr1.length; i++) { // 복사본을 만든다.
			result[i] = arr1[i];
		}
		
		//지정된 숫자를 미리 보관해놓자.
		int temp = arr1[no-1];

		for (int i=no; i<arr1.length; i++) { // 지정된 숫자부터 한칸씩 땡긴다.
			result[i-1] = arr1[i];
		}
		
		result[result.length-1] = number; //마지막 자리에 no를 입력
		return result;
	}

	public static void main(String[] args) {
		ArrayService s = 
	}
	*/
	

	// arr4배열의 배열의 begin의 위치의 수를 왼쪽으로 step수만큼 이동시킨다.
	public int[] shift(int begin, int step) {
		
		int num = arr4[begin-1];
		for (int i=begin-1; i>=begin - step; i--) {
			arr4[i] = arr4[i-1];
						
		}
		arr4[begin -step -1] = num;
		return arr4;
	}


	// 배열 복사하기
	// arr2배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
	public int[] copy(int begin) {
		int[] result3 = new int[this.arr2.length + 1 - begin];
		int position = 0;
		for (int i=begin-1 ; i<this.arr2.length; i++) {
			result3[position] = arr2[i];
			position++;
		}
		
		return result3;
	}
 

	// 배열 잘라내기
	// arr3배열을 시작점부터 끝점까지 복사한 새로운 배열 반환하기
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