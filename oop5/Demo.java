package kr.co.jhta;

import kr.co.l2.Employee;	//import의방법에는 두가지가 있다.
//import kr.co.l2.* //도 가능 하지만 클래스의 이름을 정확히 지정해 주는 것이 좋다.
import kr.co.l2.sub.Family;					// *로는 하위패키지 까지는 가져오지 못한다. 그 폴더의
					// 클래스만 가져올수 있다.

public class Demo {
	public static void main(String[] args) {
		System.out.println("패키지 데모 어플리케이션");

		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();	// 같은 패키지 안에 들어있지 않기 때문에
		System.out.println(e);		// 오류 발생

		//import로 지정하면 컴파일 가능

		Family f = new Family();
		System.out.println(f);

	}	

}