public class MemberService {
	
	
	// 고객정보
	private Member member;

	//로그인 여부
	private boolean auth = false;

	public MemberService(Member member) {
		this.member = member;
	}

	public boolean isAuth() {
		return auth;
	}

	/*
	// 아이디와 비번을 전달받아서 로그인가능 여부를 반환하는 메소드

	public boolean login(String id, String password) {
		boolean result = false;
		if (member.getId() == id && member.getPassword() == password) {
			result = true;
		} 	

		return result;
	}

	// 아이디를 전달받아서 로그아웃기능을 수행하는 메소드

	public void logout(String id) {
		System.out.println("["+id+"]님이 로그아웃 되었습니다.");
	}
	*/

	// 아이디와 비번을 전달받아서 로그인 여부를 체크하고, auth에 담아두기
		public void login(String id, String password) {
			
			if (member.getId().equals(id) && member.getPassword().equals(password)) {
				this.auth = true;		//this는 써도 되고 같은이름의 값이 없으므로 안써도 된다.
			}
		}
	// 아이디를 전달받아서 로그아웃 처리하기 (auth의 값을 false로 바꾸기)
		public void logout() {
			if (auth) {			//로그인 상태일 경우에만 auth를 false로 바꾼다.
				auth = false;
			}
		}
}