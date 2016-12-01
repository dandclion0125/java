public class Quizz3 {
	public static void main(String[] args) {
		
		String text = "The principal operations on a StringBuilder are the append and insert methods, which are overloaded so as to accept data of any type. Each effectively converts a given datum to a string and then appends or inserts the characters of that string to the string builder. ";
		text = text.toLowerCase();

		int[] alpha = new int[26];

		for(int i=0;i<text.length();i++) {
		
			int c = text.charAt(i)-97;
			if (c >= 0) {
				alpha[c]++;
				
			}
			
		}
		//System.out.println(java.util.Arrays.toString(alpha));
		for(int i=0; i<alpha.length;i++) {
			System.out.println((char)(i+97) + " : " + alpha[i]);
		}
	}
}