public class StudentApp {
	public static void main(String[] args) {
	
		StudentService service = new StudentService();
		

		Student student1 = service.getStudentByNo(25);
		System.out.println(student1);

		Student student2 = new Student(26, 3, "ÀÌ¼ø½Å", "010-5777-2211");
		service.change(student2);
		
		
	}
}