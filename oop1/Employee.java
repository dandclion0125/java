public class Employee {
	int employeeNo;
	String employeeName;
	String phonNumber;
	String depart;
	String position;
	int salary;

	public int annualSalary() {
		/*
		int result = salary * 12;
		System.out.println(employeeName + "�� ������ " + result + "�� �Դϴ�.");
		*/
		return salary * 12;
	}
	public void employeeInformation() {
		System.out.printf("�����ȣ :%d\n�̸� :%s\n��ȭ��ȣ :%s\n�μ� :%s\n���� :%s\n�޿� :%d\n���� :%d\n ",employeeNo, employeeName, phonNumber, depart, position, salary, (salary * 12));	
	
	}

}