import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아서 
		// 총점, 평균, 학점을 출력하기
		// 학점은 90이상:A, 80이상:B, 70이상:C, 60이상:D, 그외는 F
		Scanner sc = new Scanner(System.in);
				
		System.out.println("국어 점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int math = sc.nextInt();

		int total = kor + eng + math;
		System.out.println("총점: " + total);
		double avg = total/3;
		System.out.println("평균: " + avg);

		if (avg >= 90) {
			System.out.println("학점: " + "A");
		} else if (avg >= 80 && avg < 90) {
			System.out.println("학점: " + "B");
		} else if (avg >= 70 && avg < 80) {
			System.out.println("학점: " + "C");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("학점: " + "D");
		} else {
			System.out.println("학점: " + "F");
		}

	}
}
