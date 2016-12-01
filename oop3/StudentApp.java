import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);

		// 학생정보(번호, 이름, 국어, 영어, 수학 점수) 입력받아서 
		// Student 객체에 저장하기 

		Student student = new Student();

		System.out.print("번호를 입력하세요: ");
		int no = s.nextInt();
		student.setNo(no);

		System.out.print("이름을 입력하세요: ");
		String name = s.next();
		student.setName(name);

		System.out.print("국어점수를 입력하세요: ");
		int kor = s.nextInt();
		student.setKor(kor);

		System.out.print("영어점수를 입력하세요: ");
		int value1 = s.nextInt();
		student.setEng(value1);

		System.out.print("수학점수를 입력하세요: ");
		student.setMath(s.nextInt());

		System.out.println("이름: " + student.getName());
		System.out.println("국어: " + student.getKor());
		System.out.println("영어: " + student.getEng());
		System.out.println("수학: " + student.getMath());
		System.out.println("총점: " + student.getTotal());
		System.out.println("평균: " + student.getAverageForRound());



	}

}