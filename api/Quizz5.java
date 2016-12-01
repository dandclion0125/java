import java.util.StringTokenizer;
public class Quizz5 {
	public static void main(String[] args) {
	
		String[] words = {"새끼","놈","년","병신"};

		String text = "박그네 나쁜 년 빨리 내려와";

		
		// 위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기
		boolean isContains = false;
		StringTokenizer st = new StringTokenizer(text);
		for (int i=0; i<words.length;i++) {
			if(words[i].equals(st.nextToken())) {
				System.out.println("금지어 포함");
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