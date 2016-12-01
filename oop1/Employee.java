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
		System.out.println(employeeName + "의 연봉은 " + result + "원 입니다.");
		*/
		return salary * 12;
	}
	public void employeeInformation() {
		System.out.printf("사원번호 :%d\n이름 :%s\n전화번호 :%s\n부서 :%s\n직위 :%s\n급여 :%d\n연봉 :%d\n ",employeeNo, employeeName, phonNumber, depart, position, salary, (salary * 12));	
	
	}

}