import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		// �̸��� ���� �� ������ �� �ִ� ArrayList�����
		ArrayList<String> names = new ArrayList<String>();

		// ArrayList�� String��ü �����ϱ�
		names.add("ȫ�浿");
		names.add("������");
		names.add("�̼���");
		names.add("������");
		names.add("������");
		names.add("������");
		names.add("������");
		names.add("������");
		names.add("������");
		names.add("������");


		// ArrayList�� ����� ������Ʈ ���� �����ϱ�
		//names.clear();
		
		// ArrayList�� ����� ������Ʈ ���� ��ȸ�ϱ�
		int size = names.size();
		System.out.println("����� ����: "+size);
		
		// ArrayList�� ����� ������Ʈ �ҷ�����
		
		for (String username :names) {
			System.out.println(username);
		}
		
		/*
		for (int i=0;i<size;i++) {
			String username = names.get(i);
			System.out.println(username);
		}
		
		String name1 = names.get(0);
		String name2 = names.get(1);
		String name3 = names.get(2);
		String name4 = names.get(3);

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		*/
		
		// ArrayList�� ������Ʈ�� ����Ǿ� �ִ��� Ȯ���ϱ�
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("������Ʈ�� �����ϴ� ArrayList��.");

		} else {
			System.out.println("����ִ� ArrayList��.");
		}

	}	
}