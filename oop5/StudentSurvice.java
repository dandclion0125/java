/*
	StudentService��
		�л������� ����/ ��ȸ/ ����/ �����ϴ� ����� �����ϴ� Ŭ������.
*/
public class StudentSurvice {
	
	private Student[] db = new Student[5];
	
	public StudentService() {
		db[0] = new Student(23, 3, "ȫ�浿", "010-2222-2222"); 
		db[1] = new Student(43, 1, "������", "010-3333-2222");
		db[2] = new Student(21, 3, "������", "010-4444-2222");
		db[3] = new Student(26, 2, "�̼���", "010-5555-2222");
		db[4] = new Student(25, 4, "�Ƿ�", "010-6666-2222");
	}
}