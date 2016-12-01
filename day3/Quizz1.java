import java.util.Scanner;  //가져다 쓸 파일을 미리 지정한다.

public class Quizz1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // System.in ->키보드 입력

		// 국어, 영어, 수학점수를 입력받아서
		// 총합과 평균을 계산하기

		System.out.print("국어점수를 입력하세요:");
		int korScore = sc.nextInt();// 키보드 입력을 숫자로 읽어온다.
		System.out.print("영어점수를 입력하세요:");
		int engScore = sc.nextInt();
		System.out.print("수학점수를 입력하세요:");
		int mathScore = sc.nextInt();

		int totalScore = korScore + engScore + mathScore;
		double avg = totalScore/3;
		System.out.println("총합:" + totalScore);
		System.out.println("평균:" + avg);
	}

}