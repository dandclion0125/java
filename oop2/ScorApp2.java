public class ScorApp2 {
	public static void main(String[] args) {
	
		
		//객체 생성 및 홍길동 학생의 성적으로 객체가 초기화되었음
		Score s = new Score();
		
		// 생성된 객체의 필드를 초기화하는 과정을 생략할 수 있다.

		// 바로 기능 사용가능
		System.out.println("총점" + s.total());
	
		System.out.println("평균" + s.average());
	}

} 
