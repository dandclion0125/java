// 구현 클래스 --> 추상 메소드를 가질 수 없다.
public class ComtactDBAccess extends DBAccess {  // 상속받은 클래스에 추상화된 메소드가 포함되면 에러

	public void createRepository() { // 구현부가 있는 메소드로 재정의
		System.out.println("연락처 정보 저장용 저장소 생성");
	
	}
}