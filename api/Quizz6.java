import java.util.*;

public class Quizz6 {
	public static void main(String[] args) {
		

		// 1.이름, 부서, 직위, 급여를 담을 수 있는 Employee 클래스 정의하기
		// (필드 정의, 기본생성자, getter/setter)
		// 2. ^로 잘라서 배열에 담기
		// 3. 배열에 사원정보를 하나씩 추출해서, ','로 잘라서 배열에 담기 --> 여기서 배열 2개
		// 4. Employee 객체를 만들어서 사원정보의 각 데이타를 Employee 객체에 저장하기 
		// 5. Employee 객체를 employees 배열에 저장하기
		// 6. employees 배열에 저장된 정보 출력하기 --> 이중for문 사용
		String text = "홍길동,영업팀,과장,200^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,250";

		Employyes[] employees = new Employyes[4];
		Employyes emplo1 = new Employyes();

		String[] emp = text.split("\\^");
				
		for (int i=0; i<emp.length; i++) {
			String[] emp2 = emp[i].split(",");
			Employyes emplo = new Employyes();
			emplo.setName(emp2[0]);
			emplo.setDep(emp2[1]);
			emplo.setSpot(emp2[2]);
			// int salary = Integer.parseInt(values[3]); //급여값을 정수값으로 변경하기
			// emp.setSalary(salary); 
			emplo.setSalary(emp2[3]);
			employees[i] = emplo;
		}

		for (Employyes em : employees) {
			System.out.println("이름:" + em.getName() + " 부서:" + em.getDep() + " 직위:" + em.getSpot() + " 급여:" + em.getSalary());
		}
						
	}
}