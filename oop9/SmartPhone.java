public class SmartPhone extends Phone {
	
	private String ip;

	public SmartPhone() {
		super(); // �����ڸ� �ۼ��ϸ� �ڵ����� ����
					// ���� - �θ�Ŭ������ �Ű������� �����ʴ� �����ڰ� ���� ������
		System.out.println("SmartPhone() is running");
	}

	public SmartPhone(String tel, String company, String ip) {
		super(tel, company);
		this.ip = ip;
		System.out.println("SmartPhone(String, Srting, String) is running ");
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;

		
	}
}