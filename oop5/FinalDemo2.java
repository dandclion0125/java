public class FinalDemo2 {
	
	
	// ������ ��ü���� �ٸ� ���� ���� ���� ������, 
	// �ѹ� ���� �Ҵ�� ���Ŀ��� ���� ������ �� ����.
	private final int x;
	private int y;

	public FinalDemo2(int x, int y) {
		this.x = x;
		this.y = y;

	}
	public int getX() {
		return x;

	}
	//public void setX(int x) {	//setter�� final ���� ������ �� ����.
	//	this.x = x;
	//}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}