public class PhotoPrinter extends Printer {

	int size;

	// 부모클래스(Printer)의 print(String text) 메소드 재정의
	public void print(String data) { // 타입은 같게, 변수명을 달라도 된다.
		System.out.println("["+data+"]를 사진인화지에 인쇄합니다.");
	}

	public void edit() {
		System.out.println("사진을 편집합니다.");
	}
}