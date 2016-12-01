public class GarbageValueExample {
	public static void main (String[] args) {
		byte var1 = 125; //var1에 125를 대입
		int var2 = 125; //var2에 125를 대입
		for (int i=0; i<5 ; i++ ) { //i가 0부터 4가 될때까지
			var1++; //var1을 1씩 증가시킨다. 
			//byte변수는 127이라는 최고값을 넘어선 순간 최소값인 -128부터 다시 저장된다.
			var2++; //var2를 1씩 증가시킨다.
			System.out.println("var1:" + var1 + "\t" + "var2:" + var2);
		}
		
	}
}