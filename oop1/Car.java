public class Car {
	// 속성(필드) 정의하기
	int speed;				// class 내에서 참조된 변수
	

	// 기능(메소드) 정의하기
	public void speedUp(){
		speed += 10;
		System.out.println("현재 속도: " + speed + "km");

	}

	public void speedDown() {
		speed -=10;
		System.out.println("현재 속도: " + speed + "km");
	}
}