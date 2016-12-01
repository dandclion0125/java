import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
	
		String text = "하지만     박 대통령      측은 지난          4일 대국민 담화에서 검찰 조사에 성실히 임하겠다고 밝힌 것과 달리 검찰이 20일 최씨, 안 전 수석, 정호성 전 청와대 부속비서관(47)을 일괄 기소하면서 발표한 중간수사결과에 대해 '사상누각'이라고 강도 높게 비난하는 등 대면조사를 거부하는 상황이다. ";

		/*
		StringTokenizer st = new StringTokenizer(text); 
		
		int length = st.countTokens();
		System.out.println("단어 갯수: " + length);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			System.out.println("남은 토큰 갯수: " + st.countTokens());
		}

		*/


		String[] tokens = text.split(" ");
		System.out.println("단어 갯수: " + tokens.length);
		/*
			StringTokenizer
				- 문자열을 구분자를 기준으로 잘라서 토큰으로 만든다.
				- new StringTokenizer(텍스트);			//구분자를 지정하지 않으면 공백이 구분자가 된다.
				- new StringTokenizer(텍스트, 구분자);	

				- boolean hasMoreTokens() : 다음번에 꺼낼 토큰이 존재하면 true를 반환한다.
				- String nextToken()	  : 토큰(문자열)을 꺼낸다.
		*/


	}
	

}