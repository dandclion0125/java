import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();

		for( ; ; ) {
			System.out.println("1.이름등록 | 2.전화번호등록 | 3.주소등록/수정 | 4.조회 | 0.종료");
			System.out.print("메뉴를 선택하세요");
			int no = sc.nextInt();
			if (no == 1) {
				// 이름을 입력받아서 Contact에 저장합니다.
				System.out.print("이름을 입력하세요.");
				contact.setName(sc.next());
			} else if(no == 2) {
				
				Tel tel = new Tel();
				System.out.print("타입을 입력하세요.");
				tel.setType(sc.next());
				System.out.print("전화번호를 입력하세요.");
				tel.setNumber(sc.next());
				contact.addTel(tel);


				// 전화번호 정보를 입력받아서 Contact에 저장합니다.
				// Tel객체 생성 --> 값 입력받아서 채우고 --> Contact의 addTel(Tel tel)에게
				// Tel객체 전달해서 배열에 담기
			} else if(no == 3) {
				
				Address addr = new Address();
				System.out.print("우편번호를 입력하세요.");
				addr.setZipcode(sc.next());
				System.out.print("시/도를 입력하세요.");
				addr.setSido(sc.next());
				System.out.print("구/군을 입력하세요.");
				addr.setGugun(sc.next());
				System.out.print("상세주소를 입력하세요.");
				addr.setDetail(sc.next());
				
				contact.setAddress(addr);
				// 주소 정보를 입력받아서 Contact에 저장합니다.
				// Address객체 생성 --> 값 입력받아서 채우고  --> Contact의 setter 이용해서 저장
			} else if(no == 4) {
				contact.info();
				// 연락처 정보를 화면에 표시합니다.
			} else if(no == 0) {
				break;
				// 프로그램을 종료합니다.
			}
		}
		
		
	}
}


/*
Database를 대상으로 하는 작업
	create		- 새 데이타 저장 
	Retrieve	- 데이타 조회
	Update		- 데이타 수정
	Delete		- 데이타 삭제
*/
