public class MemberServiceApp {
	public static void main(String[] args) {
		
		/*
			��    ��: "ȫ�浿"
			�� �� ��: "hong"
			��й�ȣ: "1234"
			��    ��: 30    
			������ ���� Member ��ü�� ��� �ִ� MemberService��ü �����ϱ�

		*/
		Member member1 = new Member();
		
		member1.setName("ȫ�浿");
		member1.setId("hong");
		member1.setPassword("1234");
		member1.setAge(30);
		
		MemberService mb1 = new MemberService (member1);

		// MemberService�� ���ǵ� login��� ����غ���
		
		mb1.login("hong", "1234");
		System.out.println(mb1.isAuth());
		
		mb1.logout();
		System.out.println(mb1.isAuth());

	}
}