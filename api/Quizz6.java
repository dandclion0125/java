import java.util.*;

public class Quizz6 {
	public static void main(String[] args) {
		

		// 1.�̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
		// (�ʵ� ����, �⺻������, getter/setter)
		// 2. ^�� �߶� �迭�� ���
		// 3. �迭�� ��������� �ϳ��� �����ؼ�, ','�� �߶� �迭�� ��� --> ���⼭ �迭 2��
		// 4. Employee ��ü�� ���� ��������� �� ����Ÿ�� Employee ��ü�� �����ϱ� 
		// 5. Employee ��ü�� employees �迭�� �����ϱ�
		// 6. employees �迭�� ����� ���� ����ϱ� --> ����for�� ���
		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,250";

		Employyes[] employees = new Employyes[4];
		Employyes emplo1 = new Employyes();

		String[] emp = text.split("\\^");
				
		for (int i=0; i<emp.length; i++) {
			String[] emp2 = emp[i].split(",");
			Employyes emplo = new Employyes();
			emplo.setName(emp2[0]);
			emplo.setDep(emp2[1]);
			emplo.setSpot(emp2[2]);
			// int salary = Integer.parseInt(values[3]); //�޿����� ���������� �����ϱ�
			// emp.setSalary(salary); 
			emplo.setSalary(emp2[3]);
			employees[i] = emplo;
		}

		for (Employyes em : employees) {
			System.out.println("�̸�:" + em.getName() + " �μ�:" + em.getDep() + " ����:" + em.getSpot() + " �޿�:" + em.getSalary());
		}
						
	}
}