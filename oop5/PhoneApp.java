public class PhoneApp {

	public static void main(String[] args) {
	
		SmartPhone p = new SmartPhone();
		p.telNumber = "010-1234-5678";

		p.call("010-2225-2222");
		p.message("010-2222-2222", "���� ��ÿ� ������?");

		p.ip = "2140.465.123.152";
		p.email = "hong@gmail.com";

		p.web("http://www.daum.net");
		p.sendEmail("lee@gmail.com","������", "�ָ� �ڵ������Դϴ�.");



		FeaturePhone f = new FeaturePhone();
		f.telNumber = "010-4567-5845";
		f.call("010-2332-5436");
		f.message("010-3333-2222", "7�ÿ� �������� �տ��� ����.");
		f.keypad();

	}
}