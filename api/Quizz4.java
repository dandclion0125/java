import java.util.Scanner;
import java.util.regex.Pattern;

public class Quizz4 {
	public static void main(String[] args) {
		
		//아이디를 입력받아서 올바른 아이디인지 검사하기
		// 아이디 작성 규칙(길이가 6글자 이상, 영어소문자)97~122

		
		// 검사하기

		// 아이디가 6글자 이상인지 검사하기

		// 아이디가 영어 소문자로만 구성되었는지 검사하기 <----boolean
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디를 입력하세요. : ");
	
			String newId = sc.next();
			boolean invalid = false;  // <-- flag 변수 : 프로그램이 진행되는 상태를 나타내는 변수 
			
			if(newId.length()<6) {
				
				System.out.println("아이디를 6자 이상 입력하세요");
				return;
			} 

			if(newId.length()>=6) {
				for(int i=0; i<newId.length();i++) {
					if((int)newId.charAt(i)<97 && (int)newId.charAt(i)>122) {
						invalid = true;	
						break;
					} 
				}
				
				if (invalid) {
				System.out.println("소문자만 입력할 수 있습니다.");
				}
			}
		
		boolean valid = false;
		String regExp = "^[a-z]{6,}$";
		valid = Pattern.matches(regExp, newId);

		if (!valid) {
			System.out.println("유효하지 않음");
		}

		}
		

	}
}