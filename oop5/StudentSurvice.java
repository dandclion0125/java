/*
	StudentService는
		학생정보를 저장/ 조회/ 삭제/ 변경하는 기능을 제공하는 클래스다.
*/
public class StudentSurvice {
	
	private Student[] db = new Student[5];
	
	public StudentService() {
		db[0] = new Student(23, 3, "홍길동", "010-2222-2222"); 
		db[1] = new Student(43, 1, "김유신", "010-3333-2222");
		db[2] = new Student(21, 3, "강감찬", "010-4444-2222");
		db[3] = new Student(26, 2, "이순신", "010-5555-2222");
		db[4] = new Student(25, 4, "권률", "010-6666-2222");
	}
}