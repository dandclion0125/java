public class MemberApp {
	public static void main(String[] args) {
		
		// ȸ�������� ������� Member ��ü�� �����ϰ� 

		Member mb1 = new Member();
		
		// setter�� ����ؼ� �̸�, ���̵�, ���, ���� ���� ����Ÿ�� ��ü�� �����ϱ�

		mb1.setName("ȫ�浿");
		mb1.setId("h1111");
		mb1.setPassword("hhh1234");
		mb1.setAge(15);

		// ������ Member��ü�� ����� ���� getter�Լ��� ����ؼ� ȭ�鿡 ����ϱ�

		System.out.println("��    ��: " + mb1.getName());
		System.out.println("I      D: " + mb1.getId());
		System.out.println("��й�ȣ: " + mb1.getPassword());
		System.out.println("��    ��: " + mb1.getAge());

	}
}