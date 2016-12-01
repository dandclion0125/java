public class StudentApp2 {
	public static void main(String[] args) {
	
		// 학생들을 여러 명 저장하는 배열 만들기
		// Student객체 5개 담을 수 있는 배열을 생성해서 students 변수에 담았다.


		Student[] students = new Student[3];
		students[0] = new Student(3, "광수", 60, 30, 88);
		students[1] = new Student(6, "진웅", 70, 89, 77);
		students[2] = new Student(8, "공유", 67, 99, 100);

		/*
		for (int i=0;i<students.length; i++) {
			Student s = students[i];
			s.info();
		}
		*/
		System.out.println("이름 국어 영어 수학 총점 평균");
		for (Student s : students ) {
			/*
			System.out.println(s.name);
			System.out.println(s.avg());
			*/
			
			System.out.printf("%s %d %d %d %d %2.2f\n", s.name, s.kor, s.eng, s.math, s.total(), s.avg());
		}


	}

}