public abstract class Transaction {
	
	// ������ �ʴ� �۾�
	public final void connect() {
		System.out.println("���� ����� ����");
	}
	// ������ �ʴ� �۾�
	public final void close() {
		System.out.println("���� ����� ���� ����");
	}
	// ���ϴ� �۾�
	public abstract void job();

	public final void process() {
		connect();
		job();
		close();
	}
}