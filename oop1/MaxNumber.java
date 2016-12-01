public class MaxNumber {
	int max1(int[] numbers) {
		int maxnum = 0;
		for (int i=0; i<numbers.length; i++) {
			int maxnum = 0;
			if (numbers[i]>maxnum) {
				maxnum = numbers[i];
			}
			

		}
		return maxnum;
	}
}