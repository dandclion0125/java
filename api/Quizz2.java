public class Quizz2 {
	public static void main(String[] args) {
		
		String text = "<hiod@naver.com>,<pwojt2@gmail.com>,<kand@hanmail.net>,<sdkfjl3@daum.net>";
		
		String[] arr = text.split(",");
		for(String st:arr) {
			System.out.println(st.substring(1, st.length()-1));
		}
		/*
		String[] emails = text.split(",");
		for(String mail : emails) {
			int beginIndex = mail.indexOf("<");
			int endIndex = mail.indexOf(">");

			mail = mail.substring(beginIndex+1, endIndex);
			System.out.println(mail);
		}

		for(String mail : emails) {
			mail = mail.replace("<", "").replace(">", "");
			System.out.println(mail);
		}
		*/
	}
}