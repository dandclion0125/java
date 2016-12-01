public class MemberServiceApp {
	public static void main(String[] args) {
		
		/*
			이    름: "홍길동"
			아 이 디: "hong"
			비밀번호: "1234"
			나    이: 30    
			정보를 가진 Member 객체를 담고 있는 MemberService객체 생성하기

		*/
		Member member1 = new Member();
		
		member1.setName("홍길동");
		member1.setId("hong");
		member1.setPassword("1234");
		member1.setAge(30);
		
		MemberService mb1 = new MemberService (member1);

		// MemberService에 정의된 login기능 사용해보기
		
		mb1.login("hong", "1234");
		System.out.println(mb1.isAuth());
		
		mb1.logout();
		System.out.println(mb1.isAuth());

	}
}