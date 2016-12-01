public class Demo1 {
	public static void main(String[] args) {
		//  논리연산자
		// && || & | ^ !
		int x = 10;
		int y = 10;

		boolean result1 = false && x++ > 10;
		boolean result2 = false & y++ > 10;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x: " + x); //x가 10으로 출력 
		//앞의 피연산자가 false여서 뒤를 뒤를 계산하지 않기 때문에
		System.out.println("y: " + y); // y는 앞 뒤 다 연산하기때문에 11로 출력


	}
}