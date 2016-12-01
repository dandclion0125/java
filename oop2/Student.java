public class Student {
	int no; // 학번
	String name; 
	int kor;
	int eng;
	int math;

	// 기본생성자
	public Student(){
	
	}
	// 모든 필드를 초기화하는 생성자
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
	
	}
	// 총점을 반환하는 기능

	public int total() {
		int total1 = 0;
		total1 = kor + eng + math;
		return total1;
	}

	//평균을 반환하는 기능

	public double avg() {
		double avg1 = 0;
		avg1 = total()/3.0;
		return avg1;

	}

	// 학생 정보를 출력하는 기능(총점과 평균도 포함)

	public void info() {
		System.out.println("######## 학생 정보 ########");
		System.out.println("학생번호:  " + no);
		System.out.println("학생이름:  " + name);
		System.out.println("국어점수:  " + kor);
		System.out.println("영어점수:  " + eng);
		System.out.println("수학점수:  " + math);
		System.out.println("총점    :  " + total());
		System.out.println("평균    :  " + avg());
		System.out.println("############################");

	}
}