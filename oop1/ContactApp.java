public class ContactApp {

	public static void main(String[] args) {
	
	Contact c1 = new Contact();
	Contact c2 = new Contact();

	c1.no = 45;
	c2.no = 11;
	c1.name = "È«±æµ¿";
	c2.name = "±èÀ¯½Å";
	c1.phoneNumber = "010-2030-3267";
	c2.phoneNumber = "010-4938-9603";
	c1.eMail = "hong@gmail.com";
	c2.eMail = "kim34@gmail.com";

	c1.call();
	c2.sendMail();

	Contact[] c = new Contact[10];
	c[0] = c1;
	c[1] = c2;
	c[1].sendMessage();

	}
}