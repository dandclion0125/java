public class Student {
	int no; // �й�
	String name; 
	int kor;
	int eng;
	int math;

	// �⺻������
	public Student(){
	
	}
	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	public Student(int a, String b, int c, int d, int e) {
		no = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
	
	}
	// ������ ��ȯ�ϴ� ���

	public int total() {
		int total1 = 0;
		total1 = kor + eng + math;
		return total1;
	}

	//����� ��ȯ�ϴ� ���

	public double avg() {
		double avg1 = 0;
		avg1 = total()/3.0;
		return avg1;

	}

	// �л� ������ ����ϴ� ���(������ ��յ� ����)

	public void info() {
		System.out.println("######## �л� ���� ########");
		System.out.println("�л���ȣ:  " + no);
		System.out.println("�л��̸�:  " + name);
		System.out.println("��������:  " + kor);
		System.out.println("��������:  " + eng);
		System.out.println("��������:  " + math);
		System.out.println("����    :  " + total());
		System.out.println("���    :  " + avg());
		System.out.println("############################");

	}
}