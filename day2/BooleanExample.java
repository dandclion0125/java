public class BooleanExample {
	public static void main(String[] args){
		boolean stop = true; //불린 타입의 stop이라는 식별자에 true값을 저장
		if(stop) { // 만일 입력값이 참(true)일경우
			System.out.println("중지합니다."); //중지합니다 라고 출력하시오
		} else {
			System.out.println("시작합니다."); // 그 외의 경우 시작합니다 라고 출력하시오
		}
	}
}