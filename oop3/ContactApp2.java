import java.util.Scanner;

public class ContactApp2 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		ContactMgr mgr = new ContactMgr();

		
		for ( ; ; ) {
			System.out.println("1: 등록 | 2: 조회 | 0: 종료");

			System.out.print("메뉴 번호를 입력하세요:");
			int menuNo = s.nextInt();

			if (menuNo == 1) {
				//배열에 등록하기
				//mgr의 addContact(Contact contact))메서드에 등록할 Contact객체 전달

				
				Contact contact = new Contact();

				System.out.print("번호를 입력하세요 ");
				contact.setNo(s.nextInt());
				System.out.print("이름을 입력하세요 ");
				contact.setName(s.next());
				System.out.print("전화번호를 입력하세요 ");
				contact.setPhone(s.next());
				System.out.print("이메일을 입력하세요 ");
				contact.setEmail(s.next());

				mgr.addContact(contact);

			} else if (menuNo == 2) {
				//배열에 저장된 모든 연락처 정보 표시하기 
				//mgr의 displayContact()를 실행시키기 
				
				mgr.displayContact();

			} else if (menuNo == 0) {

				break;
			}

		}
	} 
}