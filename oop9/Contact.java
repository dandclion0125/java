public class Contact {
	
	private String name;
	//private Tel[] tels = new Tel[10]; //10개의 정보가 들어가는 배열
	private Tel[] tels = new Tel[50]; // 
	private Address address;

	public Contact() {}
	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tel[] getTels() {
		return tels;
	}
	
	int index = 0;
	public void addTel(Tel tel) {
		// tels배열의 적절한 위치에 담기
		
		tels[index++] = tel;
	}
	public void setTels(Tel[] tels) {
		this.tels = tels;
	}

	public Address getAddress() {
		
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void info() {
		System.out.println("이    름 : " + name);
		for (int i=0; i<index; i++) {
			System.out.println("전화번호"+(i+1)+": " + tels[i].getType() + tels[i].getNumber());
		}
		
		System.out.println("주    소 : " + address.getZipcode() + address.getSido() + address.getGugun() + address.getDetail());
	}
}