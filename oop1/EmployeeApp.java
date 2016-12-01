public class EmployeeApp {
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
	
		e1.employeeNo = 30;
		e1.employeeName = "È«±æµ¿";
		e1.phonNumber = "010-2939-2222";
		e1.depart = "ÃÑ¹«ºÎ";
		e1.position = "ÀÎÅÏ»ç¿ø";
		e1.salary = 8000000;

		// e1.annualSalary();

		int anuualSalary = e1.annualSalary();
		System.out.println("¿¬ºÀ: " + anuualSalary);
		
		e1.employeeInformation();
	
	}
}