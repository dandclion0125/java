import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		// �޴��̸��� �����ϴ� HashSet��ü �����

		HashSet<String> menuset = new HashSet<String>();

		boolean r = false;
		r = menuset.add("û����"); // �ԷµǾ����� boolean������ Ȯ��
		System.out.println("û����--->" + r); // û����--->true ���
		menuset.add("�����");
		menuset.add("��ġ�");
		menuset.add("�κ�����");
		menuset.add("�ѿ���ȸ");
		menuset.add("Ȳ���");
		menuset.add("�����ӹ�");
		menuset.add("�����ӹ�");
		menuset.add("�����ӹ�");
		r = menuset.add("�����ӹ�");
		System.out.println("�����ӹ�--->" + r); // �����ӹ�--->false ���

		System.out.println("����� ����: " + menuset.size()); // 7 ��� --> �ߺ��� ������Ʈ�� ����

		for(String me:menuset) { // �����for������ ������Ʈ ���
			System.out.println(me);
			/*
			--------- ���� ----------	
			�ѿ���ȸ
			û����
			Ȳ���
			�����ӹ�
			�κ�����
			��ġ�
			�����
			
			�� ��� ---> �Է¼������ ���X

			*/
		}

	}
}