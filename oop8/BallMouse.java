public class BallMouse implements Mouse, Cleanable {

	
	
	public void wheel() {
		System.out.println("����!");	
	}
	public void click() {
		System.out.println("�ǵ�����!");
	}

	public void move() {
		System.out.println("�Ǹ���������...");
	} 
	public void clean() {
		System.out.println("Ball�� ���� ���� �Ϸ�....�߸��߸�...");
	}
}