import java.util.StringTokenizer;
public class Quizz5 {
	public static void main(String[] args) {
	
		String[] words = {"����","��","��","����"};

		String text = "�ڱ׳� ���� �� ���� ������";

		
		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�
		boolean isContains = false;
		StringTokenizer st = new StringTokenizer(text);
		for (int i=0; i<words.length;i++) {
			if(words[i].equals(st.nextToken())) {
				System.out.println("������ ����");
			}

		}
		/*
		while(st.hasMoreTokens()) {
			
			for (String wd: words) {
				isContains = wd.equals(st.nextToken());
			}
		
		
		}
		*/
		
	}
}