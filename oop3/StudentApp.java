import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);

		// �л�����(��ȣ, �̸�, ����, ����, ���� ����) �Է¹޾Ƽ� 
		// Student ��ü�� �����ϱ� 

		Student student = new Student();

		System.out.print("��ȣ�� �Է��ϼ���: ");
		int no = s.nextInt();
		student.setNo(no);

		System.out.print("�̸��� �Է��ϼ���: ");
		String name = s.next();
		student.setName(name);

		System.out.print("���������� �Է��ϼ���: ");
		int kor = s.nextInt();
		student.setKor(kor);

		System.out.print("���������� �Է��ϼ���: ");
		int value1 = s.nextInt();
		student.setEng(value1);

		System.out.print("���������� �Է��ϼ���: ");
		student.setMath(s.nextInt());

		System.out.println("�̸�: " + student.getName());
		System.out.println("����: " + student.getKor());
		System.out.println("����: " + student.getEng());
		System.out.println("����: " + student.getMath());
		System.out.println("����: " + student.getTotal());
		System.out.println("���: " + student.getAverageForRound());



	}

}