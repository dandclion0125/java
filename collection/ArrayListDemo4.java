import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void main(String[] args) {
	
		// ������� �����ϴ� ArrayList�����
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("�ڹ�");
		subjects.add("�ڹٽ�ũ��Ʈ");
		subjects.add("SQL");
		subjects.add("�ϵ�");
		
		// SQL����� - ������ ��ü�� ��ġ�ϴ� ��ü�� ã�Ƽ� �����
		//subjects.remove("SQL");
		// SQL����� - ������ ��ġ�� ����� ��ü�� �����
		subjects.remove(2);

		System.out.println(subjects);
	}

}