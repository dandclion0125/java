public class SmartPhone extends Phone {
	
	private String ip;

	public SmartPhone() {
		super(); // 생성자를 작성하면 자동으로 생성
					// 오류 - 부모클래스에 매개변수를 넣지않는 생성자가 없기 때문에
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