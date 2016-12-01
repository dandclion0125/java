public class SwitchDemo {
	public static void main(String[] args) {
		
		String grade = "Silver"; // 자바7부터 대상값에 문자열 입력 가능

		switch (grade) { //()안에 비교대상이 되는 값을 입력
			case "Gold":
				System.out.println("골드등급 고객님 환영합니다.");
				break;
			case "Silver":
				System.out.println("실버등급 고객님 환영합니다.");
				break;
			case "Bronze":
				System.out.println("브론즈등급 고객님 환영합니다.");
				break;
			default:
				System.out.println("손님 환영합니다.");
		
		}
	}
}