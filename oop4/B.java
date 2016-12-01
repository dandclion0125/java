public class B {
	int x;
	static int y;

	public void m1() { //m1을 사용할 시점에 객체가 만들어져 있으므로 실행가능
		System.out.println(x);
		System.out.println(y);
	
	}
	// static 메소드에서는 non-static 변수를 사용할 수 없다.
	// this를 이용할 숭 없다.
	public static void m2() { // 로딩하는 순간 메소드가 실행되므로 객체가 만들어지기 전이기 때문에 x값을 불러올 수 없다.
		// System.out.println(x);
		System.out.println(y);
	
	}

	public void m3() {
		m1();
		m2();
	}
	// static메소드dptjsms non-static 메소드를 사용할 수 없다.
	public static void m4() {
		// m1(); 컴파일 오류
		m2();
	}

}