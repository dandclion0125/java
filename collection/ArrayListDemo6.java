import java.util.ArrayList;
import java.util.Collections; // Collection�� ����ϱ� ���� �޼ҵ带 ��Ƴ��� Ŭ����

public class ArrayListDemo6 {
	public static void main(String[] args) {
		
		// ��ǰ���� �����ϴ� ArrayList �����
		ArrayList<String> productNames = new ArrayList<String>();

		productNames.add("����");
		productNames.add("������");
		productNames.add("����");
		productNames.add("������");
		productNames.add("��å");
		productNames.add("å��ħ");
		productNames.add("������");

		/*
		Collections�� List, Set���� ��ü�� �ٷ�� ������ �����޼ҵ带 ������ �ִ� Ŭ������.
		*/
		
		Collections.sort(productNames);

		System.out.println(productNames);
	}
}
