public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		// NullPointerException
		// ���������� �ּҰ� ��� null�� ����Ǿ� �ִ� ���¿��� 
		// �Ӽ��̳� ����� ����� ��� �߻��Ѵ�.

		String str = "abc";
		System.out.println(str.length());

		String[] names = new String[3];
		names[0] = "ȫ�浿";
		names[1] = "������";

		for (String name : names) {
			/*
			if(name!=null) {
				System.out.println(name + ", " + name.length());
			}
			*/
			System.out.println(name == null ? "����" : name); //?���� ���� ���̸� 
			                                                  //name�� ��� �����̸� ���� "����"�� ���
		}

		// IndexOutOfBoundsException
		// �迭�̳� String���� �ε��� ������ ��� ���� ������� �� �߻��Ѵ�. 
		String str2 = "dddddddddddddddddddddddddddddddddddddssssssddddd";
		if (str2.length() >30) {
			System.out.println(str2.substring(1,30) + ".."); // abc���� 0~2��°�� �����Ƿ� ���ܹ߻�
		} else {
			System.out.println(str2);
		}

		// ArithmeticException
		// ���ڸ� 0���� ���� �� �߻��Ѵ�.
		//System.out.println(23/0);

		// ClassCastException
		// Ŭ���� Ÿ�� ����ȯ �������� ������ �ִ� ��� �߻��Ѵ�.
		Phone p1 = new SmartPhone();
		FeaturePhone p2 = (FeaturePhone) p1;
		p2.flip();


	}

	public static class Phone {
	
	}

	public static class SmartPhone extends Phone {
		public void internet() {
			System.out.println("���ͳ�");
		}
	}

	public static class FeaturePhone extends Phone {
		public void flip() {
			System.out.println("�������");
		}
	}
}