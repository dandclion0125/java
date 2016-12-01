public class BallMouse implements Mouse, Cleanable {

	
	
	public void wheel() {
		System.out.println("어이!");	
	}
	public void click() {
		System.out.println("건들지마!");
	}

	public void move() {
		System.out.println("또르르르르를...");
	} 
	public void clean() {
		System.out.println("Ball의 먼지 제거 완료....삐리삐리...");
	}
}