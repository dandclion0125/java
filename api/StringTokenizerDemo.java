import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
	
		String text = "������     �� �����      ���� ����          4�� �뱹�� ��ȭ���� ���� ���翡 ������ ���ϰڴٰ� ���� �Ͱ� �޸� ������ 20�� �־�, �� �� ����, ��ȣ�� �� û�ʹ� �μӺ񼭰�(47)�� �ϰ� ����ϸ鼭 ��ǥ�� �߰��������� ���� '��󴩰�'�̶�� ���� ���� ���ϴ� �� ������縦 �ź��ϴ� ��Ȳ�̴�. ";

		/*
		StringTokenizer st = new StringTokenizer(text); 
		
		int length = st.countTokens();
		System.out.println("�ܾ� ����: " + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("���� ��ū ����: " + st.countTokens());
		}

		*/


		String[] tokens = text.split(" ");
		System.out.println("�ܾ� ����: " + tokens.length);
		/*
			StringTokenizer
				- ���ڿ��� �����ڸ� �������� �߶� ��ū���� �����.
				- new StringTokenizer(�ؽ�Ʈ);			//�����ڸ� �������� ������ ������ �����ڰ� �ȴ�.
				- new StringTokenizer(�ؽ�Ʈ, ������);	

				- boolean hasMoreTokens() : �������� ���� ��ū�� �����ϸ� true�� ��ȯ�Ѵ�.
				- String nextToken()	  : ��ū(���ڿ�)�� ������.
		*/


	}
	

}