public class Contact {
	// 속성 정의하기
	
	// 순번
	int no;

	// 이름
	String name;
	// 연락처
	String phoneNumber;
	// 이메일
	String eMail;
	
	// 기능 정의하기

	// 전화하기 call()
	public void call() {
		System.out.println(phoneNumber + "(으)로 전화를 겁니다.");
	}
	// 문자보내기 sendMessage()
	public void sendMessage() {
		System.out.println(phoneNumber + "(으)로 문자를 보냅니다.");
	}
	// 메일보내기 sendMail()
	public void sendMail() {
		System.out.println(eMail + "(으)로 메일을 보냅니다.");
	}
}