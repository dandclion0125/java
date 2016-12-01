import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// 임의의 두자리 숫자를 입력받아서 
		// 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		Scanner sc = new Scanner(System.in);

		System.out.println("두자리 숫자를 입력하세요:");
		int number = sc.nextInt();
		int number2 = number/10;
		int number3 = number-(number2*10);
		String hangul1 = "";
		String hangul2 = "";
		
		if (number2 ==1){
			hangul1 = "십";
		} 
		if (number2 ==2){
			hangul1 = "이십";
		} 
		if (number2 ==3){
			hangul1 = "삼십";
		} 
		if (number2 ==4){
			hangul1 = "사십";
		} 
		if (number2 ==5){
			hangul1 = "오십";
		} 
		if (number2 ==6){
			hangul1 = "육십";
		} 
		if (number2 ==7){
			hangul1 = "칠십";
		} 
		if (number2 ==8){
			hangul1 = "팔십";
		} 
		if (number2 ==9){
			hangul1 = "구십";
		} 
		if (number3 ==1) {
			hangul2 = "일";
		}
		if (number3 ==2) {
			hangul2 = "이";
		}
		if (number3 ==3) {
			hangul2 = "삼";
		}
		if (number3 ==4) {
			hangul2 = "사";
		}
		if (number3 ==5) {
			hangul2 = "오";
		}
		if (number3 ==6) {
			hangul2 = "육";
		}
		if (number3 ==7) {
			hangul2 = "칠";
		}
		if (number3 ==8) {
			hangul2 = "팔";
		}
		if (number3 ==9) {
			hangul2 = "구";
		}
		System.out.println(hangul1 + hangul2);

	}
}