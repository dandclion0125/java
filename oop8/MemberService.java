public class MemberService {
	
	
	// ������
	private Member member;

	//�α��� ����
	private boolean auth = false;

	public MemberService(Member member) {
		this.member = member;
	}

	public boolean isAuth() {
		return auth;
	}

	/*
	// ���̵�� ����� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�

	public boolean login(String id, String password) {
		boolean result = false;
		if (member.getId() == id && member.getPassword() == password) {
			result = true;
		} 	

		return result;
	}

	// ���̵� ���޹޾Ƽ� �α׾ƿ������ �����ϴ� �޼ҵ�

	public void logout(String id) {
		System.out.println("["+id+"]���� �α׾ƿ� �Ǿ����ϴ�.");
	}
	*/

	// ���̵�� ����� ���޹޾Ƽ� �α��� ���θ� üũ�ϰ�, auth�� ��Ƶα�
		public void login(String id, String password) {
			
			if (member.getId().equals(id) && member.getPassword().equals(password)) {
				this.auth = true;		//this�� �ᵵ �ǰ� �����̸��� ���� �����Ƿ� �Ƚᵵ �ȴ�.
			}
		}
	// ���̵� ���޹޾Ƽ� �α׾ƿ� ó���ϱ� (auth�� ���� false�� �ٲٱ�)
		public void logout() {
			if (auth) {			//�α��� ������ ��쿡�� auth�� false�� �ٲ۴�.
				auth = false;
			}
		}
}