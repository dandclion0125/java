public class StudentApp2 {
	public static void main(String[] args) {
	
		// �л����� ���� �� �����ϴ� �迭 �����
		// Student��ü 5�� ���� �� �ִ� �迭�� �����ؼ� students ������ ��Ҵ�.


		Student[] students = new Student[3];
		students[0] = new Student(3, "����", 60, 30, 88);
		students[1] = new Student(6, "����", 70, 89, 77);
		students[2] = new Student(8, "����", 67, 99, 100);

		/*
		for (int i=0;i<students.length; i++) {
			Student s = students[i];
			s.info();
		}
		*/
		System.out.println("�̸� ���� ���� ���� ���� ���");
		for (Student s : students ) {
			/*
			System.out.println(s.name);
			System.out.println(s.avg());
			*/
			
			System.out.printf("%s %d %d %d %d %2.2f\n", s.name, s.kor, s.eng, s.math, s.total(), s.avg());
		}


	}

}