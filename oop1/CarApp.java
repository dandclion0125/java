public class CarApp {
	public static void main(String[] args) {
		
		// Car c의 의미 : Car라는 설계도를 사용해서 생성된 객체의 주소값을 담는 변수 c를 만든다.
		// Car타입(클래스 타입 = 참조타입)의 변수 c(참조변수)를 만든다.
		// c 는 참조변수 : 주소값을 담기 때문에
		// new Car(); -> Car설계도를 로드해서 객체를 생성하고, 
		// 생성된 객체를 참조할 수 있는 주소값을 반환하는 코드다.
		// Car c = new Car(); -> Car설계도를 로드해서 객체를 생성하고, 
		// 생성된 객체를 참조할 수 있는 주소값을 Car타입의 변수 c에 저장하라.
		
		Car c = new Car();
		System.out.println(c);

		Car c2 = new Car();
		System.out.println(c2);
		// 생성된 객체의 필드, 생성된 객체의 메소드를 사용하기
		
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);
		c.speedUp();
		System.out.println(c.speed);
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();


		

	}
}