public class MemberApp {
	public static void main(String[] args) {
		
		// 회원정보를 담기위한 Member 객체를 생성하고 

		Member mb1 = new Member();
		
		// setter를 사용해서 이름, 아이디, 비번, 나이 등의 데이타를 객체에 저장하기

		mb1.setName("홍길동");
		mb1.setId("h1111");
		mb1.setPassword("hhh1234");
		mb1.setAge(15);

		// 생성된 Member객체에 저장된 값을 getter함수를 사용해서 화면에 출력하기

		System.out.println("이    름: " + mb1.getName());
		System.out.println("I      D: " + mb1.getId());
		System.out.println("비밀번호: " + mb1.getPassword());
		System.out.println("나    이: " + mb1.getAge());

	}
}