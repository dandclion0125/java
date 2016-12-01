// 인터페이스: 명세, 규약, 표준, 스펙
// 모든 마우스 객체가 반드시 구현해야하는 기능을 정의한 것
public interface Mouse {
	public abstract void wheel();
	public abstract void click();
	//(public abstract) void move(); 생략가능 --> 인터페이스는 추상 메소드만 생성하므로
	public abstract void move();
}