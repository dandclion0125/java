public class Phone {
	private String tel;
	private String company;

	//public Phone() {}

	public Phone() {
		System.out.println("Phone() is running");
	}

	public Phone(String tel, String company) {
		this.tel = tel;
		this.company = company;
		System.out.println("Phone(String, String) is running");
	}

	public String getTel() {
		return tel;
	}
	public String getCompany() {
		return company;
	} 
}